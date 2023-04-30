public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cat someCat = new Cat("Nice cat", 10);
        System.out.println("Pet: " + someCat.name + " is " + someCat.age + " years old");
        Dog someDog = new Dog("some dog", 20);
        System.out.println("Pet: " + someDog.name + " is " + someDog.age + " years old");
        Person somePerson = new Person("Edziu");
        somePerson.setPet(someCat);
    }
}