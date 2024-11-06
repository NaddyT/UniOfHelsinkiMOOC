
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to? ");
        int endvalue = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from? ");
        int startvalue = Integer.valueOf(scanner.nextLine());
        
        
        while (startvalue <= endvalue) {
            System.out.println(startvalue);
            startvalue = startvalue + 1;
        }
    }
}
