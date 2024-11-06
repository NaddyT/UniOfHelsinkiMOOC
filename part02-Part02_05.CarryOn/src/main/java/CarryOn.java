
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int go = Integer.valueOf(scanner.nextLine());
            if (go == 4){
                break;
            }
        }
    }
}
