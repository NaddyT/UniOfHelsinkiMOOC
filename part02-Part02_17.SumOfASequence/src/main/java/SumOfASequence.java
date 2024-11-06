
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number? ");
        int endvalue = Integer.valueOf(scanner.nextLine());
        int count = 0;
        int total = 0;
        
        while (count <= endvalue) {
            total = total + count;
            count += 1;
        }
        System.out.println("The sum is " + total);
    }
}
