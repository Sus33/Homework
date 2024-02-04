package car;

public class HybridCar extends Car implements IElectric, IFuel {
    int speed;
    String model;

    HybridCar(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void withElectric(ElectricCar electric) {
        if (electric.getBatteryCapacity() > 0 && speed <= 60) {
            System.out.println("A hybrid car has driven by an electric motor.");
        } else {
            System.out.println("A car needs to charge!!!");
        }
    }

    @Override
    public void withFuel(Fuel fuel) {
        if (fuel.getFuelPerLtr() > 0 && speed > 60) {
            System.out.println("Hybrid car driving with fuel.");
        } else {
            System.out.println("Needs to be loaded a fuel!!!");
        }
    }
    void gearbox() {
        System.out.println("Gearbox in automatic.");
    }
}
