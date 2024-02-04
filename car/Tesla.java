package car;

public class Tesla extends Car implements IElectric {

    void gearbox() {
        System.out.println("Gearbox in automatic.");
    }

    @Override
    public void withElectric(ElectricCar electric) {
        if (electric.getNumOfBatteries() > 0) {
            System.out.println("The car is driven by an Electric motor.");
        } else {
            System.out.println("Battery is low!!!");
        }
    }
}
