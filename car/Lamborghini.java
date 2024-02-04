package car;

public class Lamborghini extends Car {
    String model;

    Lamborghini(String model) {
        this.model = model;
    }
    void gearbox() {
        System.out.println("Gearbox in automatic.");
    }
}
