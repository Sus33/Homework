package bankSystem;

abstract class Payment {
    Payment() {
        System.out.println("Payment method using");
    }

    abstract void pay();
}
