package first;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scan.nextInt();

        System.out.print("Enter the operator (+, -, *, /)"); // When run version2, please add comment
        char operator = scan.next().charAt(0);    // in this 2 rows, char operators

        System.out.println("Enter second number");
        int secondNumber = scan.nextInt();

        calcNumbers(firstNumber, secondNumber, operator);  // When run version2, please add comment

        //Version2. Print All operators function at once
        //set the values in VO

//        CalculatorVO calVO = new CalculatorVO();
//        calVO.setFirstNumber(firstNumber);
//        calVO.setSecondNumber(secondNumber);
//        Calculation cal = new Calculation();
//        int addResult = cal.add(calVO.getFirstNumber(), calVO.getSecondNumber());
//        System.out.println("Addition Result ="+addResult);
//
//        int subResult = cal.subtract(calVO.getFirstNumber(), calVO.getSecondNumber());
//        System.out.println("Subtraction Result ="+subResult);
//
//        int mulResult = cal.multiply(calVO.getFirstNumber(), calVO.getSecondNumber());
//        System.out.println("Multiplication Result ="+mulResult);
//
//        float divResult = cal.divide(calVO.getFirstNumber(), calVO.getSecondNumber());
//        System.out.println("Division Result ="+divResult);
//
//    }
    }

    //Version1
    public static void calcNumbers(int num1, int num2, char operator) {
        int i = 0;
        switch (operator) {
            // case to sum
            case '+' -> i = num1 + num2;
            // case to sub
            case '-' -> i = num1 - num2;
            // case to multiply
            case '*' -> i = num1 * num2;
            // case to divide
            case '/' -> i = num1 / num2;
            default -> System.err.println("You enter wrong input");
        }
        System.out.println("The final result");
        System.out.println();
        // print the final result
        System.out.print(num1 + " " + operator + " " + num2 + " = " + i);
    }
}
