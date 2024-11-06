
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int firstnumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        double secondnumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the third number: ");
        double thirdnumber = Integer.parseInt(scanner.nextLine());    
        
        double value = (firstnumber + secondnumber + thirdnumber) / 3;
                
        System.out.println("The average is " + value);
    }
}
