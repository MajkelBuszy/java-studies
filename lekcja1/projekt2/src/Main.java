import java.io.*;
import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {
        Console cnsl = System.console();

        System.out.println("---------------Decision---------------");

        final String goodMorning = "Good Morning!";
        final String goodAfternoon = "Good Afternoon!";
        final String goodNight = "Good Night!";
        final String error = "Invalid hour";

        System.out.println("Enter hour: ");
        int hour = parseInt(cnsl.readLine());


        if (hour > 23 || hour < 0) {
            System.out.println(String.format("%s", error));
            return;
        }

        if (hour < 12) {
            System.out.println(String.format("%s", goodMorning));
        }

        if (hour >= 12 && hour < 18) {
            System.out.println(String.format("%s", goodAfternoon));
        }

        if (hour >= 18 && hour != 0) {
            System.out.println(String.format("%s", goodNight));
        }
    }
}