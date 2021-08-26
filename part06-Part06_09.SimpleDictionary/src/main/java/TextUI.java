/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDict;

    public TextUI(Scanner scanner, SimpleDictionary simpleDict) {
        this.scanner = scanner;
        this.simpleDict = simpleDict;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                this.add();
            } else if (command.equals("search")){
                this.search();
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public void add() {
        System.out.println("Word: ");
        String word = scanner.nextLine();
        System.out.println("Translation: ");
        String translation = scanner.nextLine();

        simpleDict.add(word, translation);
    }
    
    public void search(){
        System.out.println("To be translated: ");
        String word = scanner.nextLine();
        if(this.simpleDict.contains(word)){
            System.out.println("Translation: \n" + this.simpleDict.translate(word));
        } else {
            System.out.println("Word " + word + " was not found");
        }
    }
}
