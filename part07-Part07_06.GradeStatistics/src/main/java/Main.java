
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grading grading = new Grading();
        // Write your program here -- consider breaking the program into 
        // multiple classes

        System.out.println("Enter points totals, -1 stops: ");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            if (input <= 100 && input >= 0) {
                grading.addPoints(input);
                grading.addPointsToGrades(input);
            }

        }

        System.out.println("Point average (all): " + grading.average());
        System.out.println("Points average (passing): " + grading.passingAvg());
        System.out.println("Pass percentage: " + grading.passPercentage());
        System.out.println("Grade distribution: ");
        grading.printGrades();

    }
}
