package homeworks;

public class WhitTernaryOperator {
    public static void main(String[] args) {
        //Task2. Print 0-100, where number is even.
        for (int i = 0; i <= 100; i++) {
            String result = i % 2 == 0 ? "The number is even " + i : "The number is odd " + i;
            System.out.println(result);
        }

        //Task10.1 WhitForLoop
//        for (int i = 65; i >= 23; i--) {
//            String result = (i % 2 == 0) ? "Even " + i + "+" + 12 + "=" + (i + 12) : "Odd " + i + "+" + 25 + "=" + (i + 25);
//            System.out.println(result);
//    }

        //Task10.2 WhitWhileLoop
//        int i = 65;
//        while (i >= 23) {
//            String result = (i % 2 == 0) ? "Even " + i + "+" + 12 + "=" + (i + 12) : "Odd " + i + "+" + 25 + "=" + (i + 25);
//            System.out.println(result);
//            i--;
//        }
    }
}
