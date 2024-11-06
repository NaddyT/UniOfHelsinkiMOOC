
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String oldestname = "";
        int age = 0;
        while (true) {
           
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            
            //longest name
            
            if (Integer.valueOf(pieces[1])> age) {
                age = Integer.valueOf(pieces[1]);
                oldestname = pieces[0];
            }
             

        }
       System.out.println("Name of the oldest: " + oldestname);
    }
}
