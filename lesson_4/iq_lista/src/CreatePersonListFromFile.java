import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatePersonListFromFile {
    public static List<Person> getPeopleList() {
        List<Person> personList = new ArrayList<>();

        try {
            FileInputStream file = new FileInputStream("./iq.txt");
            Scanner sc = new Scanner(file);

            String[] a;
            String l;
            String name;
            String iq;

            for (int i = 1; sc.hasNext(); i++) {
                l = sc.nextLine().strip();
                a = l.split(",");

                System.out.println(a[0] + " iq: " + a[1]);
                name = a[0].strip();
                iq = a[1].strip();
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        return personList;
    }
}
