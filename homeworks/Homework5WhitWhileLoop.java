package homeworks;

/*
This all tasks will be done in while loop.
*/
public class Homework5WhitWhileLoop {
    public static void main(String[] args) {

        //Task1. Print 0-100 numbers
//        int i = 0;
//        while (i <= 100) {
//            System.out.println(i);
//            i++;
//        }

        //Task2. Print 0-100, where number is even.
//        int i = 0;
//        while (i <= 100) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }

        //Task3. Count and Print 0-100 numbers sum.
//        int i = 0;
//        int sum = 0;
//        while (i <= 100) {
//            sum += i;
//            i++;
//        }
//        System.out.println("Sum = " + sum);

       //Task3.1 Same Task in Do While loop
//        int sum = 0;
//        int i = 1;
//        do {
//            sum += i;
//            i++;
//        } while (i <= 100);
//        System.out.println("The sum is " + sum);

        //Task4. Count 0-100 numbers in 2 step.
//        int i = 0;
//        while (i <= 100) {
//            System.out.println(i);
//            i += 2;
//        }

        //Task5. Count 0-100 numbers in 5 step.
//        int i = 100;
//        while (i >= 0) {
//            System.out.println(i);
//            i -= 5;
//        }

        //Task6. Count and Print 0-1000 numbers sum.
//        int sum = 0;
//        int i = 0;
//        while (i <= 100) {
//            sum += i;
//            i++;
//        }
//        System.out.println("Sum = " + sum);

        //Task7. Count and Print 0-100 numbers sum which divided by 4 and 7.
//        int sum = 0;
//        int i = 0;
//        while (i <= 1000) {
//            if (i % 4 == 0 && i % 7 == 0) {
//                sum += i;
//            }
//            i++;
//        }
//        System.out.println(sum);

        //Task8. Count and Print 0-100 numbers sum which divided by 4 and remainder of 3.
//        int sum = 0;
//        int i = 0;
//        while (i <= 1000) {
//            if (i % 4 == 3) {
//                sum += i;
//            }
//            i++;
//        }
//        System.out.println(sum);

        //Task9. Count and Print 100-300 numbers sum which divided by 6 and 7.
//        int sum = 300;
//        int i = 100;
//        while (i <= 300) {
//            if (i % 6 == 0 && i % 7 == 0) {
//                sum += i;
//            }
//            i++;
//        }
//        System.out.println(sum);

        //Task10.
        int i = 65;
        while (i >= 23) {
            if (i % 2 == 0) {
                System.out.println("Even " + i + "+" + 12 + "=" + (i + 12));
            } else {
                System.out.println("Odd " + i + "+" + 25 + "=" + (i + 25));
            }
            i--;
        }
    }
}