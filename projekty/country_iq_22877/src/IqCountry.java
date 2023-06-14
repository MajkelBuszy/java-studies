class IqCountry {
    private int place;
    private String country;
    private int iq;

    public IqCountry(int place, String country, int iq) {
        this.place = place;
        this.country = country;
        this.iq = iq;
    }

    public int getPlace() {
        return place;
    }

    public String getCountry() {
        return country;
    }

    public int getIq() {
        return iq;
    }

    @Override
    public String toString() {
        return "Miejsce: " + place + ", Kraj: " + country + ", IQ: " + iq;
    }
}
