
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstnumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter second number:");
        int secondnumber = Integer.valueOf(scanner.nextLine());
        
        divisibleByThreeInRange(firstnumber, secondnumber);

    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        while (beginning <= end) {
            
            if ((double)beginning % 3 == 0) {
                System.out.println(beginning);
            }
            
            beginning += 1;
        }
    }
}
