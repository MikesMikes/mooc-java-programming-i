
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        Database db = new Database(scanner);

        while (true) {
            System.out.println("?");
            String input = scanner.nextLine();

            if (input.equals("Quit")) {
                break;
            }

            if (input.equals("Add")) {
                db.addAnimal();
            }
            
            if(input.equals("Observation")){
                db.addObservation();
            }
            
            if(input.equals("All")){
                db.printAll();
            }
            
            if(input.equals("One")){
                db.printOne();
            }
        }
    }
    


}
