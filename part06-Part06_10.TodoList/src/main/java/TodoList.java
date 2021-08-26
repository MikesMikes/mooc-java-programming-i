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

public class TodoList {
    private ArrayList<String> todoArr;
    
    public TodoList(){
        this.todoArr = new ArrayList<>();
    }
    
    public void add(String task){
        this.todoArr.add(task);
    }
    
    public void print(){
        int index = 1;
        
        for(String i : this.todoArr){
            String line = String.format("%d: %s", index, i);
            System.out.println(line);
            index++;
        }
        
    }
    
    public void remove(int number){
        this.todoArr.remove(number-1);
    }
}
