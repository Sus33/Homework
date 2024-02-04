package bankSystem;

abstract class Bank {
    static final String KIND = "Normal";
    String name;
    String acType;
    int accNo;
    int bal;
    int amt;

    abstract int getRateOfInterest();

    abstract void viewAccountNumber();

    abstract void bankName();

    void display() {
        System.out.println("Show information: Name is " + name + ". Account number is " + accNo + ". Balance is " + bal);
    }

    int deposit(int amount) {
        return amount;
    }

    int withdraw(int balance) {
        System.out.println("Your Balance=" + bal);
        return balance;
    }

    public String getKind() {
        return KIND;
    }
}

