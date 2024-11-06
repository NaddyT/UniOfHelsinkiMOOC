
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstnumber = 1;
        int secondnumber =2;
                
        firstnumber = Integer.valueOf(scanner.nextLine());
        secondnumber = Integer.valueOf(scanner.nextLine());
        
        if (firstnumber > secondnumber ) {
            System.out.println(firstnumber + " is greater than " + secondnumber);
        } else if (secondnumber > firstnumber) {
            System.out.println(firstnumber + " is smaller than " + secondnumber);
        } else {
            System.out.println(firstnumber + " is equal to " + secondnumber);
        }
    }
}
