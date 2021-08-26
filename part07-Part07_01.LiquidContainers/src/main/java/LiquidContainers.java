
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println(String.format("First: %d/100", first));
            System.out.println(String.format("Second: %d/100", second));

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (input.equals("quit")) {
                break;
            }

            if (amount < 0) {
                continue;
            }

            if (command.equals("add")) {
                if (first + amount > 100) {
                    first = 100;
                } else {
                    first += amount;
                }
            }

            if (command.equals("move")) {

                if (first - amount < 0 && second + amount > 100) {
                    second = 100;
                    first = 0;
                } else if (second + amount > 100) {
                    first -= amount;
                    second = 100;
                } else if (first - amount < 0) {
                    second += first;
                    first = 0;
                } else {
                    first -= amount;
                    second += amount;
                }
            }

            if (command.equals("remove")) {
                if (second - amount < 0) {
                    second = 0;
                } else {
                    second -= amount;
                }
            }

        }

    }

}
