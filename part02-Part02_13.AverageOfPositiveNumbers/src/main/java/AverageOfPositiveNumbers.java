
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double count = 0;
        double sum = 0;
        double average = 0;
        
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());

            if (value == 0) {
                if (sum == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                average = (sum / count);
                System.out.println("Average of the numbers: " + average);
                break;
            } else if (value > 0) {
                count = count + 1;
                sum = sum + value;
                continue;
            } else {
                continue;
            }
        }
    }
}
