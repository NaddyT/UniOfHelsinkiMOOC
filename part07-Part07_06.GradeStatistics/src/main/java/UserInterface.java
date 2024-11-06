
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xlumi
 */
public class UserInterface {
    private Scanner scanner;
    private Statistics stats;
    
    public UserInterface(Scanner scanner, Statistics stats){
        this.scanner = scanner;
        this.stats = stats;
    }
    
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        while (true){
            String value = scanner.nextLine();
            if (Integer.valueOf(value) == -1) {
                break;
            }
            if (Integer.valueOf(value) < 0 || Integer.valueOf(value) > 100) {
                continue;
            } else {
                stats.addPoints(Integer.valueOf(value));
            }
        }
        
        System.out.println("Point average (all): " + stats.AveragePoints());
        if (stats.PassingAveragePoints() < 50) {
            System.out.println("Point average (passing): -"); 
        } else {
            System.out.println("Point average (passing): " + stats.PassingAveragePoints()); 
        }
        System.out.println("Pass percentage: " + stats.PassingPercentage()); 
        System.out.println("Grade distribution");
        stats.gradeCheck();
    }
}
