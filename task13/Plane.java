package task13;

public class Plane extends Vehicle {
    int numOfSeat(int count) {
        return count;
    }

    int engine(int count) {
        System.out.println("How many engines have?");
        return count;
    }

    public void toFly() {
        System.out.println("To Fly");
    }
}
