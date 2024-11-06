
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("");
        
        System.out.println("Search for? ");
        String inputs = scanner.nextLine();
        
        boolean found = list.contains(inputs);
        if (found) {
            System.out.println(inputs + " was found!");
        } else {
            System.out.println(inputs + " was not found!");
        }
    }
}
