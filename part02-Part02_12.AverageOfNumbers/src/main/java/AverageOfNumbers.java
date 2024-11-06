
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double count = 0;
        double sum = 0;
        double average = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());

            if (value == 0) {
                System.out.println(sum);
                System.out.println(count);
                average = (sum / count);
                System.out.println("Average of the numbers: " + average);
                break;
            } else {
                count = count + 1;
                sum = sum + value;
                continue;
            }
        }
    }
}
