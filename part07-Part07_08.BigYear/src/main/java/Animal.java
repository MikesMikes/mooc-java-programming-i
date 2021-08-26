/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Animal {
    private String name;
    private String latinName;
    private int observations;
    
    public Animal(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addObservations(){
        this.observations++;
    }
    
    public String toString(){
        String thisAnimal = String.format("%s (%s): %d obsertvations", this.name, this.latinName, this.observations);
        return thisAnimal;
    }
}
