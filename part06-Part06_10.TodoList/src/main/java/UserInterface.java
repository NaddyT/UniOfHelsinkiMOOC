import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList TodoList;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.TodoList = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("add")) {
                add();
            } else if (command.equals("list")) {
                list();
            } else if (command.equals("remove")){
                System.out.println("Which one is removed?");
                int index = Integer.valueOf(scanner.nextLine());
                remove(index);
            } else if (command.equals("stop")) {
                break;
            }
            
        }
        
    }
    
    public void add(){
        System.out.println("To add:");
        String item = scanner.nextLine();
        this.TodoList.add(item);
    }
    
    public void list(){
            this.TodoList.print();        
    }
    
    public void remove(int index){
        this.TodoList.remove(index);
    }
    
}
