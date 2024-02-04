package fibonacci;

public class Fibonacci {
    public static int fibonacciRecursion(int count) {
        if (count == 0) {
            return 0;
        }

        if (count == 1 || count == 2) {
            return 1;
        }

        return fibonacciRecursion(count - 1) + fibonacciRecursion(count - 2);
    }

    static int factorial(int n) {
        if (n == 0) return 1;
        else return (n * factorial(n - 1));
    }

    //Usual
//    static void factorial(int fact, int number) {
//        for (int i = 1; i <= number; i++) {
//            fact *= i;
//        }
//        System.out.println(fact);
//    }

    private static void hanoi(int count, String first, String middle, String last) {

        if (count == 1) {
            System.out.println("Disk 1 moved from " + first + " to " + last);
            return;
        }
        hanoi(count - 1, first, last, middle);
        System.out.println("Disk " + count + " moved from " + first + " to " + last);
        hanoi(count - 1, middle, first, last);
    }

    //Usual
//    static void fib() {
//        int x = 0;
//        int y = 1;
//        int sum;
//        int count = 12;
//        System.out.print(x + " " + y);‹
//        for (int i = 2; i <= count; ++i) {
//            sum = x + y;
//            System.out.print(" " + sum);
//            x = y
//            y = sum;
//        }
//    }
    public static void main(String[] args) {
        int count = 12;

        System.out.print("Fibonacci " + count + " numbers is \n");
        for (int i = 0; i < count; ++i) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
//        fib(); //Usual
        System.out.println();
        int fact;
        int number = 5;
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is " + fact);
//        factorial(1, 5); //Usual
        System.out.println("Tower of Hanoi");
        hanoi(3, "FirstDisk", "SecondDisk", "ThirdDisk");
    }
}
