
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Statistics stats = new Statistics();
        UserInterface ui = new UserInterface(scanner, stats);
        ui.start();
        }
}

