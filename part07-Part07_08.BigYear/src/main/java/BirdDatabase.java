import java.util.ArrayList;
import java.util.Scanner;

public class BirdDatabase {
    private ArrayList<Bird> listOfBirds;
    private boolean foundBird;
    
    public BirdDatabase(){
        this.listOfBirds = new ArrayList<>();
        this.foundBird = false;
    }
    
    public void addBird(Scanner scan){
        System.out.println("Name: ");
        String birdName = scan.nextLine();
        System.out.println("Name in Latin: ");
        String latinName = scan.nextLine();
        listOfBirds.add(new Bird(birdName, latinName));
    }
    
    public void addObservation(Scanner scan){
        System.out.println("Bird?");
        String birdName = scan.nextLine();
        
        for (Bird bird : this.listOfBirds) {
            if (bird.getBirdName().equals(birdName)) {
                foundBird = true;
                bird.addObservation();
            } else {
                System.out.println("Not a bird!");
            }
        }
    }
    
    
    public void printBirds(){
        for (Bird bird : this.listOfBirds) {
            System.out.println(bird);
        }
    }
    
    public void printOneBird(Scanner scan){
        System.out.println("Bird? ");
        String birdName = scan.nextLine();
        
        for (Bird bird : this.listOfBirds) {
            if (bird.getBirdName().equals(birdName)) {
                foundBird = true;
                System.out.println(bird);
            }
            
            if (foundBird = false) {
                System.out.println("Not a bird!");
            }
        }
    
    }
}
