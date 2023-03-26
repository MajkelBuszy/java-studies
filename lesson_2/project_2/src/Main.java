import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int points = sc.nextInt();

        String responseGrade = getGradeStringFromPoints(points);

        System.out.printf("Your grade: %s%n", responseGrade);

    }

    public static String getGradeStringFromPoints(int points) {
        if (points < 0 || points > 100) return "Points out of range";
        if (points >= 91) return "5";
        if (points >= 81) return "4+";
        if (points >= 71) return "4";
        if (points >= 61) return "3+";
        if (points >= 51) return "3";
        return "2";
    }
}