package bankSystem;

public class BankAccount extends Bank {
    @Override
    int deposit(int amount) {
        amt = amount;
        if (amt < 0) {
            System.err.println("Invalid Amount");
        }
        bal = bal + amt;
        return amount;
    }

    @Override
    int withdraw(int balance) {
        bal = balance;
        if (bal < amt) {
            System.out.println("Not sufficient balance.");
        }
        if (amt < 0) {
            System.err.println("Invalid Amount");
        }
        bal = bal - amt;
        return balance;
    }

    @Override
    void display() {
        System.out.println("Balance: " + bal);
        System.out.println("Amount: " + amt);
    }
    int getRateOfInterest(){
        return 7;
    }

    @Override
    void viewAccountNumber() {
        System.out.println("Checking account number: #1932042");
    }

    @Override
    void bankName() {
        System.out.println("The bank name is Converse.");
    }
}
