public abstract class Vechicle {
    public String name;
    public String color;
    public String producer;
    public int wheelsNumber;

    public Vechicle(String name, String color, String producer) {
        this.name = name;
        this.color = color;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

}
