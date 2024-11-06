/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xlumi
 */
public class Item {
    private String identifier;
    private String name;
    
    public Item(String identify, String name) {
        this.name = name;
        this.identifier = identify;
    }
    
    public String toString(){
        return this.identifier + ": " + this.name;
    }
    
    public boolean equals(Object compare) {
        if (compare.equals(this.identifier)) {
            return true;
        }
        
        if (!(compare instanceof Item)) {
            return false;
        }
        
        Item compareItem = (Item) compare;
        
        if (compareItem.identifier == this.identifier) {
        return true;
        }
        return false;
    }
}
