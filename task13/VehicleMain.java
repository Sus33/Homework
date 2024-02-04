package task13;

public class VehicleMain {
    public static void main(String[] args) {
        FighterAircraft pl = new FighterAircraft();
        System.out.println(pl.name("P-51 Mustang. "));
        pl.numOfSeat(1);
        pl.engine(1);
        pl.maxSpeed = 440;
        pl.toFly();
        FlyingScotsman fly = new FlyingScotsman();
        fly.duration = 4;
        fly.operatingSpeed(125);
        fly.numberOfSeat = 1000;
        fly.count();
        fly.duration();
    }
}
