package OOP.Practice04;

public class Main {
    public static void main(String[] args) {
        
        

        try {
            Account acc1 = new Account("1234", -80);
            System.out.println("Account Number 1: " + acc1.getAccNum());
            System.out.println("Balance: " + acc1.getBalance());
        }
        catch (IllegalArgumentException e) {
            System.err.println("Account Number 1 (Error): " + e.getMessage());

        }

        try {
            Account acc2 = new Account("1233", 100);
            System.out.println("\nAccount Number 2: " + acc2.getAccNum());
            System.out.println("Balance: " + acc2.getBalance());
        } 
        catch (IllegalArgumentException e) {
            System.err.println("Account Number 2 (Error): " + e.getMessage());
        }
    }
    
}
