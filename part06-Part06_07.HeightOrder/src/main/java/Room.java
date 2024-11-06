import java.util.ArrayList;
public class Room {
    private ArrayList<Person> room = new ArrayList<>();
    
    public Room(){
        this.room = new ArrayList<>();
    }
    
    public void add(Person person){
        this.room.add(person);
    }
    
    public boolean isEmpty(){
        if (this.room.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.room;
    }
    
    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }
        
        Person shortest = this.room.get(0);
        
        for (Person person : this.room){
            if (person.getHeight() < shortest.getHeight())
                shortest = person;
        }
        
        return shortest;
    }
    
    public Person take(){
        if (this.room.isEmpty()) {
            return null;
        }
        
        Person shortest = this.room.get(0);
        
        for (Person person : this.room){
            if (person.getHeight() < shortest.getHeight())
                shortest = person;
        }
        
        this.room.remove(shortest);
        return shortest;
    }    
        
        
}

