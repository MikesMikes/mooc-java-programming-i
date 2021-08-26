
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier> (Empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            System.out.println("Name? (Empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Item item = new Item(id, name);
            items.add(item);

        }

        ArrayList<Item> toPrint = new ArrayList<>();

        for(Item i : items){
            if(!(toPrint.contains(i))){
                toPrint.add(i);
            }
        }
        
        System.out.println("==Items==");
        for(Item j : toPrint){
            System.out.println(j.getId() + ": " + j.getName());
        }

    }

}
