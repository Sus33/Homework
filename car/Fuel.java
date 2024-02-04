package car;

public class Fuel {
    String type;
    int fuelPerLtr;

    Fuel(String type) {
        this.type = type;
    }

    String type() {
        return type;
    }

    public String toString() {
        return type();
    }

    public int getFuelPerLtr() {
        return fuelPerLtr;
    }

    public void setFuelPerLtr(int fuelPerLtr) {
        this.fuelPerLtr = fuelPerLtr;
    }
}
