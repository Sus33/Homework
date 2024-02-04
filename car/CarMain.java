package car;

public class CarMain {
    public static void main(String[] args) {
        Fuel fuel = new Fuel("Petrol");
        fuel.setFuelPerLtr(5);

        Lada priora = new Lada();
        priora.gearbox();
        priora.withFuel(fuel);

        ElectricCar electric = new ElectricCar();
        electric.setBatteryCapacity(67);

        Tesla tesla = new Tesla();
        tesla.gearbox();
        tesla.withElectric(electric);

        LP780_4Ultimate avantador = new LP780_4Ultimate("LP780_4Ultimate");
        avantador.gearbox();
        avantador.withFuel(fuel);

        HybridCar lexus = new HybridCar("Model RX", 65);
        lexus.gearbox();
        lexus.withFuel(fuel);
        lexus.withElectric(electric);
    }
}
