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

public class UserInterface {
    private TodoList todo;
    private Scanner scanner;
    
    public UserInterface(TodoList todo, Scanner scanner){
        this.todo = todo;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if(command.equals("stop")){
                break;
            } else if(command.equals("add")){
                add();
            } else if(command.equals("list")){
                this.todo.print();
            } else if(command.equals("remove")){
                remove();
            }
        }
    }
    
    public void add(){
        System.out.println("To add: ");
        String task = scanner.nextLine();
        this.todo.add(task);
    }
    
    public void remove(){
        System.out.println("Which one is removed? ");
        int number = Integer.valueOf(scanner.nextLine());
        this.todo.remove(number);
    }
}
