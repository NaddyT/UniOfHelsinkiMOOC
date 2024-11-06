
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int value = Integer.valueOf(scanner.nextLine());
        
        while (count <= value) {
            System.out.println(count);
            count = count + 1;
        }
    }
}
