
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeBook rb = new RecipeBook();
        UserInterface ui = new UserInterface(scanner, rb);
        ui.start();
    }
    
    
}
