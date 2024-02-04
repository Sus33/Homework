package constructor;

public class Colosseum extends Buildings {
    final int piecesCount = 9036;

    Colosseum() {

    }

    Colosseum(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    int pieces(int count) {
        System.out.println("The pieces count is " + piecesCount);
        return piecesCount;
    }

    void getDimensions(int width, int height, int depth) {
        System.out.println("The dimension width is " + width + ", height " + height + " and the depth is " + depth);
    }

    @Override
    int allowAge(int age) {
        System.out.println("The allow age is " + age);
        return age;
    }

    @Override
    public double getPrice(double price) {
        System.out.println("The price is $" + price);
        return price;
    }

    @Override
    public String getManufacture(String manufacture) {
        System.out.println("Made in " + manufacture);
        return manufacture;
    }
}
