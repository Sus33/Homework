package bankSystem;

public class USDPayment extends Payment {
    @Override
    void pay() {
        System.out.println("USD.");
    }
}
