package homeworks;

public class Homework4 {
    public static void main(String[] args) {

        //Task1. Print 0-100 numbers
//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
//        }

        //Task2. Print 0-100, where number is even.
//            for (int i = 0; i <= 100; i++) {
//                if (i % 2 == 0)
//                    System.out.println(i);
//            }

        //Task3. Count and Print 0-100 numbers sum.
//        int sum=0;
//        for (int i = 0; i <= 100; ++i) {
//            sum += i;
//        }
//        System.out.println("Sum = " + sum);

        //Task4. Count 0-100 numbers in 2 step.
//        for (int i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }

        //Task5. Count 0-100 numbers in 5 step.
//        for (int i = 100; i >= 0; i-=5) {
//            System.out.println(i);
//        }

        //Task6. Count and Print 0-1000 numbers sum.
//        int sum=0;
//        for (int i = 0; i <= 1000; ++i) {
//            sum += i;
//        }
//        System.out.println("Sum = " + sum);

        //Task7. Count and Print 0-100 numbers sum which divided by 4 and 7.
//        int sum = 0;
//        for (int i = 0; i <= 1000; i++) {
//            if (i % 4 == 0 && i % 7 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

        //Task8. Count and Print 0-100 numbers sum which divided by 4 and remainder of 3.
//        int sum = 0;
//        for (int i = 0; i <= 1000; i++) {
//            if (i % 4 == 3) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

        //Task9. Count and Print 100-300 numbers sum which divided by 6 and 7.
//        int sum = 300;
//        for (int i = 100; i <= 300; i++) {
//            if (i % 6 == 0 && i % 7 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

        //Task10.
        for (int i = 65; i >= 23; i--) {
            if (i % 2 == 0) {
                System.out.println("Even " + i + "+" + 12 + "=" + (i + 12));
            } else {
                System.out.println("Odd " + i + "+" + 25 + "=" + (i + 25));
            }
        }
    }
}
