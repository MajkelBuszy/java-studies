import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------Exceptions---------------");

        List<Person> personList = CreatePersonListFromFile.getPeopleList();

        System.out.println(personList);
    }
}