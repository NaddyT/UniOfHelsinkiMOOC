
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int firstnumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        double secondnumber = Integer.parseInt(scanner.nextLine());
        
        double value = (firstnumber + secondnumber) / 2;
                
        System.out.println("The average is " + value);
    }
}
