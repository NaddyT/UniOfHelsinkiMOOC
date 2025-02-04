
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.00;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change = 0;
        if (payment >= 2.5) {
            this.affordableMeals ++;
            this.money = this.money + payment;
                change = payment - 2.5;
                this.money = this.money - change;
                return change;
            
        } else {
            change = payment;
        }
        
        return change;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change = 0;
        if (payment >= 4.3) {
            this.heartyMeals ++;
            this.money = this.money + payment;
                change = payment - 4.3;
                this.money = this.money - change;
                return change;
            
        } else {
            change = payment;
        }
        
        return change;
    }

    public boolean eatAffordably(PaymentCard card) {
    // an affordable meal costs 2.50 euros
    // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
    // otherwise false is returned

        if (card.balance() < 2.5){
            return false;
        }
        this.affordableMeals ++;
        card.takeMoney(2.5);
        
        return true;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if (card.balance() < 4.3){
            return false;
        }
        this.heartyMeals ++;
        card.takeMoney(4.3);
        
        return true;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum < 0) {
            this.money = this.money;
        } else {
        this.money = this.money + sum;
        card.addMoney(sum);
        }
    }
    
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
    
}
