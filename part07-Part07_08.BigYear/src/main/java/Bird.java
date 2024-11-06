public class Bird {
    private String birdName;
    private String latinBirdName;
    private int birdObservations;
    
    
    public Bird(String name, String latin){
        this.birdName = name;
        this.latinBirdName = latin;
        this.birdObservations = 0;
    } 
    
    public String getBirdName(){
        return this.birdName;
    }
    
    public String getBirdLatinName(){
        return this.latinBirdName;
    }
    
    public int getObservation(){
        return this.birdObservations;
    }
    
    public void addObservation(){
        this.birdObservations = this.birdObservations + 1;
    }
    
    public String toString(){
        return this.birdName + " (" + this.latinBirdName + ") " + this.birdObservations + " observations";
    }
}
