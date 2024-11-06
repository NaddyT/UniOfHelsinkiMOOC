
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string");
        String stringv = scan.nextLine();
        
        System.out.println("Give an integer");
        int integerv = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double");
        double doublev = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean");
        boolean booleanv = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string: " + stringv);
        System.out.println("You gave the integer: " + integerv);
        System.out.println("You gave the double: " + doublev);
        System.out.println("You gave the boolean: " + booleanv);
    }
}
