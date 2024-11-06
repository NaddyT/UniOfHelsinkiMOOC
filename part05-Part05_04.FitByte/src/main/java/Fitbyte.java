/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xlumi
 */
public class Fitbyte {
    private int age;
    private int restHeartRate;
    
    public Fitbyte(int age, int restHeartRate) {
        this.age = age;
        this.restHeartRate = restHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        return (maxHeartRate() - this.restHeartRate) * percentageOfMaximum + this.restHeartRate;
    }
    
    public double maxHeartRate(){
        return 206.3 - (0.711 * this.age);
    }
    
    
   
}
