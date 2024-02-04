package car;

public class ElectricCar extends Car {
    float batteryCapacity;
    int numOfBatteries;

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getNumOfBatteries() {
        return numOfBatteries;
    }

    public void setNumOfBatteries(int numOfBatteries) {
        this.numOfBatteries = numOfBatteries;
    }
}

