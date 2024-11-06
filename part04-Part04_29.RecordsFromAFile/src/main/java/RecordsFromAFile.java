
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
         try (Scanner txt = new Scanner(Paths.get(file))) {
             while (txt.hasNextLine()){
                 String line = txt.nextLine();
                 
                 String[] parts = line.split(",");
                 String name = parts[0];
                 String age = parts[1];
                 String year = "";
                 
                 if ( (Integer.valueOf(age) > 1) || (Integer.valueOf(age) == 0)) {
                     year = "years";
                 } else {
                     year = "year";
                 }
                 
                 System.out.println(name + ", " + "age: " + age + " " + year );
                         
                         
             }
         } catch (Exception e) {
             
             System.out.println("error");
         }
    }
}
