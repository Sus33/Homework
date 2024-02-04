package bankSystem;

public class CashPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Cash.");
    }
}
