
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int firstnumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int secondnumber = Integer.parseInt(scanner.nextLine());
        
                
        System.out.println(firstnumber + " + " + secondnumber + " = " + (firstnumber + secondnumber));
        System.out.println(firstnumber + " - " + secondnumber + " = " + (firstnumber - secondnumber));
        System.out.println(firstnumber + " * " + secondnumber + " = " + (firstnumber * secondnumber));
        System.out.println(firstnumber + " / " + secondnumber + " = " + ((double) firstnumber / (double) secondnumber));        
    }
}
