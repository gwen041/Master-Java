package OOP.Practice04;

public class Account {
    private String accNum;
    private double balance;

    public Account(String accNum, double balance) {

        if (accNum == null || accNum.isEmpty()) {
            throw new IllegalArgumentException("Account number must not be blank.");
            
        }

        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative!");
        }

        this.accNum = accNum;
        this.balance = balance;
    }

    public String getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }  
}