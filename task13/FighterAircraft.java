package task13;

public class FighterAircraft extends Plane {
    String name(String name) {
        return name;
    }

    @Override
    public void toFly() {
        System.out.println("It flew to a maximum speed of about " + maxSpeed + " miles per hour.");
    }

    @Override
    int engine(int count) {
        System.out.println("The engines count is " + count);
        return count;
    }

    @Override
    int numOfSeat(int count) {
        System.out.println("Is a " + count + " (single-seat) fighter aircraft.");
        return count;
    }
}
