package bankSystem;

class MinusAccount extends BankAccount {

    static final String KIND = "Minus";

    public MinusAccount() {
    }

    @Override
    int getRateOfInterest() {
        return -8;
    }

    @Override
    void viewAccountNumber() {
        System.out.println("Account number: #1932042");
    }

    @Override
    void bankName() {
        System.out.println("The bank name is Wells Fargo.");
    }

    @Override
    public String getKind() {
        System.out.println("Kind is " + KIND);
        return KIND;
    }
}
