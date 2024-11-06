import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        int totalWeight = 0;
        
        for (Suitcase item : this.suitcases) {
            totalWeight = totalWeight + item.totalWeight();
        }
        
        if (suitcase.totalWeight() + totalWeight<= maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString(){
        int totalWeight = 0;
        
        for (Suitcase item : this.suitcases) {
            totalWeight = totalWeight + item.totalWeight();
        }
        
        return this.suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
    
    public void printItems(){
        for (Suitcase element : suitcases) {
            element.printItems();
        }

    }
}
