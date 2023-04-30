public class AutoMain {
    public static void main(String[] args) {
        System.out.println("-------------------- Abstract Class Vechicle --------------");

        Car someCar = new Car("Super car", "czerwony szybki", "lamborgini");
        Motorcycle someMotorcycle = new Motorcycle("Ninja", "czarny z zielonym szybkoi bardzo", "Kawasaki");
        Truck someTruck = new Truck("Big Ben", "dlugi duzy bialy", "Skania");

        System.out.printf("Vechicle name: %s \nVechicle color: %s \nVechicle producer: %s \nVechicle wheels number: %s \n", someCar.getName(), someCar.getColor(), someCar.getProducer(), someCar.getWheelsNumber());
        System.out.printf("Vechicle name: %s \nVechicle color: %s \nVechicle producer: %s \nVechicle wheels number: %s \n", someMotorcycle.getName(), someMotorcycle.getColor(), someMotorcycle.getProducer(), someMotorcycle.getWheelsNumber());
        System.out.printf("Vechicle name: %s \nVechicle color: %s \nVechicle producer: %s \nVechicle wheels number: %s \n", someTruck.getName(), someTruck.getColor(), someTruck.getProducer(), someTruck.getWheelsNumber());
    }
}
