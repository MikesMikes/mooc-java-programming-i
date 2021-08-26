
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        if(this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        
        int number = this.elements.size();
        
        String inputString = "";
        
        for(String i : elements){
            inputString = inputString + i + "\n";
        }
        
        if(number == 1){
            return "The collection " + this.name + " has " + number + " element:\n" + this.elements.get(0);
        }
        
        return "The collection " + this.name + " has " + number + " elements:\n" + inputString;
    }
    
}
