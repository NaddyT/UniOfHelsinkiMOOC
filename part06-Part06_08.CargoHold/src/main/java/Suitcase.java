import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcase = new ArrayList<>();
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.suitcase = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        
        if (item.getWeight() + this.totalWeight() <= maxWeight){
            this.suitcase.add(item);
        }
        
    }
    
    public String toString(){
        if (this.suitcase.isEmpty()) {
            return "no items (" + totalWeight() + " kg)";
        }
        
        if (this.suitcase.size() == 1) {
            return this.suitcase.size() + " item (" + totalWeight() + " kg)";
        }
        
        return this.suitcase.size() + " items (" + totalWeight() + " kg)";
    }
    
    public void printItems() {
        
        for (Item item : this.suitcase) {
            System.out.println(item);
        }
        
    }
    
    public int totalWeight() {
        if (this.suitcase.isEmpty()) {
            return 0;
        }
        
        int totalWeight = 0;
        
        for (Item item : this.suitcase) {
            totalWeight = totalWeight + item.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem(){
        if (this.suitcase.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.suitcase.get(0);
        
        for (Item item : this.suitcase) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
    
    
}
