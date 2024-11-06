import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list = new ArrayList<>();
    
    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print(){
        int exercise = 0;
        
        for (String item : this.list){
            exercise = exercise + 1;
            System.out.println(exercise + ": " + item);
        }
    }
    
    public void remove(int number){
        this.list.remove(number - 1);
    }
    
    
}
