import java.util.Scanner;

public class UserInterface {
        private Scanner scanner;
        private BirdDatabase BD;
        
        public UserInterface(Scanner scan, BirdDatabase bd){
            this.scanner = scan;
            this.BD = bd;
        }
    
        public void start(Scanner scan, BirdDatabase bd){
            while (true){
                System.out.println("?");   
                String command = this.scanner.nextLine();
                
                switch (command) {
                    case "Add":
                        bd.addBird(scan);
                        break;
                    case "Observation":
                        bd.addObservation(scan);
                        break;
                    case "All":
                        bd.printBirds();
                        break;
                    case "One":
                        bd.printOneBird(scan);
                        break;
                    case "Quit":
                        return;
                    default:
                        System.out.println("not a command");
                }
            }

            
        }
}
