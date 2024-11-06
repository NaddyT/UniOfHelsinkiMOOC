
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstnumber = 1;
                
        firstnumber = Integer.valueOf(scanner.nextLine());
        
        if (firstnumber < 0 ) {
            int value = (firstnumber * -1);
            System.out.println(value);
        } else {
            System.out.println(firstnumber);
        }
    }
}
