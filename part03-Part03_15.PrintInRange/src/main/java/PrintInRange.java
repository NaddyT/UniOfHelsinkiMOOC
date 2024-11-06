
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        /*

        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);
        */
        // ArrayList<Integer> numbers = new ArrayList<>();
    } 
  
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in the range " + "[" + lowerLimit + ", " + upperLimit + "]");
        for (int number: numbers) {
            if ((number > lowerLimit) && (number < upperLimit)) {
                System.out.println(number);
            }
        }
    }
    
}
