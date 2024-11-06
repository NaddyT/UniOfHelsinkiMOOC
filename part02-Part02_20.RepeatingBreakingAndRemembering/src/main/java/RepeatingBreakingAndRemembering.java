
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a numbers:");
        int count = 0;
        int sum = 0;
        double average =0;
        int positive = 0;
        int negative = 0;
        
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (( (double) value % 2) == 0) {
                positive += 1;
            } else {
                negative += 1;
            }
            sum = sum + value;
            count += 1;
        }
        average = ((double) sum / (double) count);
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + average);
        System.out.println("Even: " + positive);
        System.out.println("Odd: " + negative);
    }
}
