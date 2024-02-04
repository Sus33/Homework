package constructor;

public class MainConstructor {
    public static void main(String[] args) {
        Lego lego = new Lego();
        lego.construct();
        Colosseum col = new Colosseum();
        Colosseum col1 = new Colosseum(52,27,59);  // Second version
        System.out.println(col1);  //  Override toString
        col.getDimensions(52, 27, 59);
        col.pieces(col.piecesCount);
        col.getManufacture("Italy");
        col.allowAge(18);
        col.getPrice(549.99);
    }
}
