
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        boolean found = false;
        
         try { Scanner scan = new Scanner(Paths.get(file)); 
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                list.add(row);
            }
        
        } catch (Exception e) {
            System.out.println("Reading the file " + file + "failed." );
        }

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        for (String item : list) {
            if (item.equals(searchedFor)){
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }

    }
}
