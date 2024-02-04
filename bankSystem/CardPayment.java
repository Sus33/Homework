package bankSystem;

public class CardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Debit or credit card.");
    }
}
