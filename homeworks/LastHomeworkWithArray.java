package homeworks;

import java.util.Scanner;

public class LastHomeworkWithArray {
    public static void main(String[] args) {
        //Task2. Print 0-100, where number is even and odd.
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements you want in array");
        num = scanner.nextInt();
        int[] array = new int[num];
        System.out.println("Enter all the elements");
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Odd numbers");
        for (int i = 0; i < num; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Even numbers");
        for (int i = 0; i < num; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        //Task3. Count and Print 0-100 numbers sum.

//        int[] my_array = new int[100];
//        int sum = 0;
//
//        for (int i = 0; i <= my_array.length; ++i) {
//            sum += i;
//        }
//        System.out.println("The sum is " + sum);

    }
}