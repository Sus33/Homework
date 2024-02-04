package bankSystem;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.bankName();
        bankAccount.deposit(45);
        bankAccount.withdraw(78);
        bankAccount.display();
        bankAccount.viewAccountNumber();
        CashPayment cash = new CashPayment();
        cash.pay();
        Bank bank = new BankAccount();
        CardPayment card = new CardPayment();
        card.pay();
        System.out.println("Rate of Interest is: " + bank.getRateOfInterest() + " %");
        bank = new MinusAccount();  //DynamicDispatch
        bank.bankName();
        bank.getKind();
        bank.viewAccountNumber();
        System.out.println("Rate of Interest is: " + bank.getRateOfInterest() + " %");
        USDPayment usd = new USDPayment();
        usd.pay();
    }
}
