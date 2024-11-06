
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number? ");
        int startvalue = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number? ");
        int endvalue = Integer.valueOf(scanner.nextLine());
        int total = 0;
        
        while (startvalue <= endvalue) {
            total = total + startvalue;
            startvalue += 1;
        }
        System.out.println("The sum is " + total);
    }
}
