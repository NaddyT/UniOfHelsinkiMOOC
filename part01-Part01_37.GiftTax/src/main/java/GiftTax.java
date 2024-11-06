
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double gift = Double.valueOf(scan.nextLine());
        
        double band1 = (100 + (gift - 5000) * 0.08);
        double band2 = (1700 + (gift - 25000) * 0.10);
        double band3 = (4700 + (gift - 55000) * 0.12);
        double band4 = (22100 + (gift - 200000) * 0.15);
        double band5 = (142100 + (gift - 1000000) * 0.17);
        
        
        if (gift < 5000) {
            System.out.println("No tax!");
        } else if ((gift >= 5000) && (gift < 25000)) {
            System.out.println("Tax: " + band1);
        } else if ((gift >= 25000) && (gift < 55000)) {
            System.out.println("Tax: " + band2);
        } else if ((gift >= 55000) && (gift < 200000)) {
            System.out.println("Tax: " + band3);
        } else if ((gift >= 200000) && (gift < 1000000)) {
            System.out.println("Tax: " + band4);
        } else if (gift >= 1000000) {
            System.out.println("Tax: " + band5);
        }
    }
}
