
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstnumber = 1;
        int secondnumber =2;
                
        firstnumber = Integer.valueOf(scanner.nextLine());
        secondnumber = Integer.valueOf(scanner.nextLine());
        int sum = firstnumber + secondnumber;
        
        if (sum < 0 ) {
            System.out.println("sum is not positive");
        } else {
            double squareroot = Math.sqrt(sum);
            System.out.println(squareroot);
        }
    }
}
