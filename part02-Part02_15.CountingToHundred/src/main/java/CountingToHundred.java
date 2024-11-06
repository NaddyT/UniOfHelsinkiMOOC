
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = Integer.valueOf(scanner.nextLine());
        int reversecount = value;
        
        
        while (reversecount <= 100) {
            System.out.println(reversecount);
            reversecount = reversecount + 1;
        }
    }
}
