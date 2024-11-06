
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int firstnumber = Integer.valueOf(scan.nextLine());
       
        System.out.println("Give the second number:");
        int secondnumber = Integer.valueOf(scan.nextLine());
        
        if (firstnumber > secondnumber) {
            System.out.println("Greater number is " + firstnumber);
        } else if (secondnumber > firstnumber) {
            System.out.println("Greater number is " + secondnumber);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
