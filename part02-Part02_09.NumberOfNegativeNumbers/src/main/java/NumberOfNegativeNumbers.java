
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int negativecount = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());

            if (value < 0) {
                negativecount = negativecount + 1;
                continue;
            } else if (value == 0) {
                System.out.println("Number of negative numbers: " + negativecount);
                break;
            }
            
        }
    }
}
