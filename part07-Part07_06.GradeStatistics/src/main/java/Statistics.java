import java.util.ArrayList;
public class Statistics {
    
    private int overallpoints;
    private int count;
    private int countOfPassed;
    private double passedPoints;
    private ArrayList<Integer> points = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();
    
    public Statistics() {
        this.overallpoints = 0;
        this.count = 0;
        this.countOfPassed = 0;
        this.passedPoints = 0;
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public void addPoints(int number){
        if (!(number > 100) || !(number < 0)) {
        this.overallpoints = this.overallpoints + number;
        this.count++;
        this.points.add(number);
        
        if ( number >= 50) {
            this.passedPoints = this.passedPoints + number;
            this.countOfPassed++;
        }
        }
    }
    
    public double AveragePoints() {
        if (this.count < 2) {
            return this.overallpoints;
        } else {
        return (double) this.overallpoints / this.count;
        }
    }
    
    public double PassingAveragePoints(){
        if (this.passedPoints < 50) {
            return 0;
        } else {
        double passing = (double) this.passedPoints / this.countOfPassed;
        
        if (passing >=50) {
            return passing;
        } else {
            return 0;
        }
        }
    }
    
    public double PassingPercentage(){
        return 100 * (double) this.countOfPassed / this.count;
    }
    
    public void gradeCheck(){
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        
        for (Integer no : points) {
            if (no < 50) {
                zero++;
            } else if (no < 60) {
                one++;
            } else if (no < 70) {
                two++;
            } else if (no < 80) {
                three++;
            } else if (no < 90) {
                four++;
            } else if (no >= 90) {
                five++;
            }
        }
        
        grades.add(zero);
        grades.add(one);
        grades.add(two);
        grades.add(three);
        grades.add(four);
        grades.add(five);

        System.out.println("Grade distribution:");
        for (int i = grades.size() - 1; i >= 0; i--) {
            System.out.print(i + ":");
            for (int j = 0; j < grades.get(i); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
