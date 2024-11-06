
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
    }
    
    public static void removeLast(ArrayList<String> strings) {
        int last = strings.size()-1;
        
        if (strings.size() == 0) {
        return;
        }
        
        strings.remove(last);
    }
}
