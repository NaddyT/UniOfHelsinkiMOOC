
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int birth = 0;
        int countbirth = 0;
        int totalbirth = 0;
        String longestname = "";
        while (true) {
           
            String input = scanner.nextLine();

            
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            
            //longest name
            
            if (pieces[0].length() > longestname.length()) {
                longestname = pieces[0];
            }
            
            
            //Add sum for average
            totalbirth = totalbirth + Integer.valueOf(pieces[1]);
            countbirth = countbirth +1;
             

        }
       System.out.println("Longest name: " + longestname);
       System.out.println("Average of the birth years: " + (1.0 * totalbirth / countbirth));

    }
}
