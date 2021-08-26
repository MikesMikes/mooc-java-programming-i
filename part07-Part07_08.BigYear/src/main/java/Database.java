/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    private ArrayList<Animal> animals;
    private Scanner scanner;

    public Database(Scanner scanner) {
        this.animals = new ArrayList<>();
        this.scanner = scanner;
    }

    public void addAnimal() {
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Name in Latin: ");
        String latinName = scanner.nextLine();

        Animal animal = new Animal(name, latinName);
        this.animals.add(animal);
    }

    public void addObservation() {
        System.out.println("Bird?");
        String bird = scanner.nextLine();
        if (isAnimal(bird)) {
            for (Animal i : animals) {
                if (i.getName().equals(bird)) {
                    i.addObservations();
                }
            }
        } else {
            System.out.println("Not a bird!");
        }
    }

    private boolean isAnimal(String name) {
        boolean isAnimal = false;
        for (Animal i : animals) {
            if (i.getName().equals(name)) {
                isAnimal = true;
            }
        }
        return isAnimal;
    }

    public void printAll() {
        for (Animal i : animals) {
            System.out.println(i);
        }
    }

    public void printOne() {
        System.out.println("Bird?");
        String name = scanner.nextLine();
        Animal animal = null;
        for(Animal i : animals){
            if(i.getName().equals(name)){
                animal = i;
            }
        }
        System.out.println(animal);
    }

}
