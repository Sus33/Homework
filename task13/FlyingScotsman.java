package task13;

public class FlyingScotsman extends Train {
    @Override
    public void duration() {
        System.out.println("The duration is " + duration + " hours.");
    }

    int operatingSpeed(int speed) {
        System.out.println("The maximum speed of about " + speed + " miles per hour.");
        return speed;
    }

    @Override
    public void count() {
        System.out.println("They have " + numberOfSeat + " passengers.");
    }
}
