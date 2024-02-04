package constructor;

public class Lego extends Constructor {
    int allowAge(int age){
        return age;
    }

    int pieces(int count) {
        return count;
    }

    @Override
    public void construct() {
        System.out.println("Lego is constructed.");
    }
}
