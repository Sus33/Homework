package first;

public class Factorial {
    static void factorial(int fact, int number) {
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        factorial(1,5);
    }
}
