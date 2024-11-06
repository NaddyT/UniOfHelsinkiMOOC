import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary SimpleDictionary) {
        this.simpleDictionary = SimpleDictionary;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            
        if (command.equals("end")) {
             end();
             break;
        } else if (command.equals("add")){
            add();
        } else if(command.equals("search")) {
            search();    
        } else {
            System.out.println("Unknown command");
        }
            
            
        }
    }
    
    public void end(){
        System.out.println("Bye bye!");
    }
    
    public void add(){
        System.out.println("Word:");
        String dictionaryCommand = scanner.nextLine();
        System.out.println("Translation:");
        String translation = scanner.nextLine();

        this.simpleDictionary.add(dictionaryCommand, translation);
    }
    
    public void search() {
        System.out.println("To be translated:");
                    
        String search = scanner.nextLine();
        String searched = this.simpleDictionary.translate(search);

        if(searched == null) {
            System.out.println("Word " + search + " was not found");
        } else {
            System.out.println("Translation:");
            System.out.println(searched);                    
        }
    }
}
