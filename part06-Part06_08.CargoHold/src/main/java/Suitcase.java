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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int weight){
        this.items = new ArrayList<>();
        this.maxWeight = weight;
    }
        
    public void addItem(Item item){
        int additionalWeight = this.totalWeight() + item.getWeight();
        
        if(additionalWeight <= maxWeight){
            items.add(item);
        }
    }
    
    public int totalWeight(){
        if(items.isEmpty()){
            return 0;
        }
        int totalWeight = 0;
        
        for(Item item : items){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public String toString(){
        int numItems = items.size();
        
        if(numItems == 0){
            return String.format("no items (%d kg)", this.totalWeight());
        }
        
        if(numItems == 1){
            return String.format("%d item (%d kg)", numItems, this.totalWeight());
        }
        
        return String.format("%d items (%d kg)", numItems, this.totalWeight());
    }
    
    public void printItems(){
        String stringItems = "";
        for(Item i : items){
            stringItems = stringItems + i + "\n";
        }
        
        System.out.print(stringItems);
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        
        Item heaviest = this.items.get(0);
        
        for(Item i : items){
            if(i.getWeight() > heaviest.getWeight()){
                heaviest = i;
            }
        }
        return heaviest;
    }
}
