package first;

public class CalculationWithoutScanner {

    static void add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }

    public static void subtract(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    static void multiply(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        System.out.println(result);
    }

    public static void divide(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Don't divide number 0");
        } else {
            double result = (((double) firstNumber / (double) secondNumber));
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        add(6, 4);
        subtract(6, 4);
        multiply(6, 4);
        divide(6, 4);
    }
}
