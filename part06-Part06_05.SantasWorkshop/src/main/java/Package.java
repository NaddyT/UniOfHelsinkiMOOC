import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public Package(){
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        this.gifts.add(gift);
    }
    
    public int totalWeight(){
        int total = 0;
        
        for(Gift gift : this.gifts) {
            total = total + gift.getWeight();
        }
        
        return total;
    }
}
