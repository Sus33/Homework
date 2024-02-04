package homeworks;

public class Fibonacci {
    public static void main(String[] args) {

        int x = 0;
        int y = 1;
        int sum;
        int count = 12;
        System.out.print(x + " " + y);
        for (int i = 2; i <= count; ++i) {
            sum = x + y;
            System.out.print(" " + sum);
            x = y;
            y = sum;
        }
    }
}