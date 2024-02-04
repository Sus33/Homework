package car;

public class Lada extends Car implements IFuel{

    void gearbox() {
        System.out.println("Gearbox in mechanical.");
    }

    @Override
    public void withFuel(Fuel fuel) {
        if (fuel.getFuelPerLtr() > 0) {
            System.out.println("Car driving with fuel.");
        } else {
            System.out.println("Needs to be loaded a fuel!!!");
        }
    }
}
