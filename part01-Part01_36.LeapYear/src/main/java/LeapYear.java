
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int leapyear = Integer.valueOf(scan.nextLine());

        if (((leapyear % 4 == 0) && (leapyear % 100 != 0)) || (leapyear % 400 ==0)) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
