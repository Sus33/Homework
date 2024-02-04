package car;

public class LP780_4Ultimate extends Lamborghini implements IFuel {

    LP780_4Ultimate(String model) {
        super(model);
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
