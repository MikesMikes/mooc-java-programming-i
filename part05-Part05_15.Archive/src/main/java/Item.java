/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
public class Item {
    private String name;
    private String id;
    
    public Item(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    public boolean equals(Object item){
        if(this == item){
            return true;
        }
        
        if(!(item instanceof Item)){
            return false;
        }
        
        Item compared = (Item) item;
        
        if(this.id.equals(compared.id)){
            return true;
        }
        
        return false;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getId(){
        return this.id;
    }
    
}
