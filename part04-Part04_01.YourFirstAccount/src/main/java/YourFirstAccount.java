
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        Account NaddyAccount = new Account("Naddy's account", 100.00);
        
        NaddyAccount.deposit(20.00);
        System.out.println(NaddyAccount);
    }
}
