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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcaseHolding;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcaseHolding = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(this.totalWeightInHold() + suitcase.totalWeight() <= this.maxWeight){
            this.suitcaseHolding.add(suitcase);
        }
    }
    
    public int totalWeightInHold(){
        if(this.suitcaseHolding.size() == 0){
            return 0;
        }
        
        int holdingWeight = 0;
        
        for(Suitcase i : this.suitcaseHolding){
            holdingWeight += i.totalWeight();
        }
        
        return holdingWeight;
    }
    
    public String toString(){
        int suitcases = this.suitcaseHolding.size();
        return String.format("%d suitcases (%d kg)", suitcases, this.totalWeightInHold());
    }
    
    public void printItems(){
        for(Suitcase i : this.suitcaseHolding){
            i.printItems();
        }
    }
    
}
