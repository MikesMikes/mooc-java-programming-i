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
import java.util.ArrayList;

public class UserInterface {

    private Scanner scanner;
    private FileReader fileReader;
    private RecipeBook book;

    public UserInterface(Scanner scanner, RecipeBook recipeBook) {
        this.scanner = scanner;
        this.fileReader = new FileReader();
        this.book = recipeBook;
    }

    public void start() {
        ArrayList<String> fileAsArray = createFile();
        this.book.createBook(fileAsArray);
        listCommands();

        while (true) {
            System.out.print("Enter command: ");
            String userInput = scanner.nextLine();
            System.out.println("");
            if (userInput.equals("stop")) {
                break;
            }

            String[] parts = userInput.split(" ");

            if (parts.length == 1) {
                String command = parts[0];
                if (command.equals("list")) {
                    this.book.listAll();
                } else {
                    continue;
                }
            } else if (parts.length == 2) {
                if (parts[0].equals("find")) {
                    if (parts[1].equals("name")) {
                        findName();
                    } else if (parts[1].equals("ingredient")) {
                        findIngredient();
                    }
                } else {
                    continue;
                }
            } else if (parts.length == 3) {
                if (parts[0].equals("find")) {
                    if (parts[1].equals("cooking")) {
                        if (parts[2].equals("time")) {
                            findByTime();
                        }
                    }
                }
            } else {
                continue;
            }
            System.out.println("");
        }
    }

    public void findByTime() {
        System.out.println("Max cooking time: ");
        int time = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        System.out.println("Recipes: ");
        this.book.findByCookingTime(time);
    }

    public void findIngredient() {
        System.out.println("Ingredient: ");
        String ingredient = scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes: ");
        this.book.findByIngredient(ingredient);
    }

    public void findName() {
        System.out.println("Searched word: ");
        String name = scanner.nextLine();
        this.book.findRecipe(name);
    }

    private void listCommands() {
        System.out.println("");
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("");
    }

    public ArrayList<String> createFile() {
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        ArrayList<String> fileAsArray = fileReader.createFileAsArray(fileName);
        return fileAsArray;
    }
}
