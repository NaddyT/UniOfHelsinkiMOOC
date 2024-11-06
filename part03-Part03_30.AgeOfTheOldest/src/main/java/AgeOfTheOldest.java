
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        int check = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            check = Integer.valueOf(parts[1]);
            
            if (check > oldest) {
                oldest = check;
            }
        }
        System.out.println("Age of oldest: " + oldest );

    }
}

