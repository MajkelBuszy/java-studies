public class Cat extends Pet {
    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Cat speaks miauu");
    }
}
