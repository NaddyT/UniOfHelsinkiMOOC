
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number? ");
        int value = Integer.valueOf(scanner.nextLine());
        int count = 1;
        int total = 1;
        
        while (count <= value) {
            total = total * count;
            count += 1;
        }
        System.out.println("Factorial: " + total);
    }
}
