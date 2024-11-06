
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstnumber = 1;
                
        firstnumber = Integer.valueOf(scanner.nextLine());
        int square = firstnumber * firstnumber;
        
        System.out.println(square);
    }
}
