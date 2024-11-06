
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String identifier, name;
        ArrayList<Item> items = new ArrayList<>(); 

        while (true) {
            System.out.println("Identifier?(empty will stop)");
            identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            
            if (name.equals("") || identifier.equals("")) {
                break;
            }
            
            Item item = new Item(identifier, name);
            
            if (items.contains(item)) {
                continue;
            } else {
                items.add(item);
            }
            
            identifier = "";
            name = "";
            
        }
        
        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item);
        }
        
    }
}
