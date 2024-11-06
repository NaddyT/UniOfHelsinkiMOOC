
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = count;
        this.sum = sum;
    }

    public void addNumber(int number) {
        this.sum = this.sum + number;
        this.count = this.count + 1;
    }

    public int getCount() {
        return this.count;
    }
    public int sum() {
        return this.sum;
    }

    public double average() {
        if (count == 0){
            return 0.0;
        } else {
        return (double)this.sum / (double)this.count;
        }
    }
}
