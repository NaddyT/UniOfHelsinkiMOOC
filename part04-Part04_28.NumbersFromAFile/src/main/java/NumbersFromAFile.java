
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
        
        try (Scanner txt = new Scanner(Paths.get(file))) {
            while (txt.hasNextLine()) {
                String row = txt.nextLine();
                if (Integer.valueOf(row) >= lowerBound & Integer.valueOf(row) <= upperBound) {
                    count = count + 1;
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("Numbers: " + count);

    }

}
