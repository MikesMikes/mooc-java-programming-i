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

public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean isEmpty(){
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        if(persons.isEmpty()){
            return null;
        }
        
        return persons;
    }
    
    public Person shortest(){
        if(persons.isEmpty()){
            return null;
        }
        
        Person shortestPerson = persons.get(0);
        for(Person i : persons){
            if(i.getHeight() < shortestPerson.getHeight()){
                shortestPerson = i;
            }
        }
        
        return shortestPerson;
    }
    
    public Person take(){
        if(persons.isEmpty()){
            return null;
        }
        
        int shortest = this.persons.indexOf(this.shortest());
        
        return this.persons.remove(shortest);
    }
}
