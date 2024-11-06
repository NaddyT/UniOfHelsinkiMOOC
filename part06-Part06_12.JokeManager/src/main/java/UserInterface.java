import java.util.Scanner;

public class UserInterface {
    private Scanner input;
    private JokeManager jokeManager;
    
    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.input = scanner;
        this.jokeManager = jokeManager;
    }
    
    public void start(){
        while (true){
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
        
        String command = input.nextLine();
        
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = input.nextLine();
                jokeManager.addJoke(joke);
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(jokeManager.drawJoke());
            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                jokeManager.printJokes();
            } else if (command.equals("X")) {
                break;
            }
        }
    }
}
