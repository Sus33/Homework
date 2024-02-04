package homeworks;

import java.util.Scanner;

public class TasksWithSwitch {
    public static void main(String[] args) {

        //Task2 Print 0-100, where number is even using switch.
        Scanner scan = new Scanner(System.in); //create a scanner object for input
        System.out.print("Enter the integer number: ");
        int num = scan.nextInt();  //get input from the user for num
        switch (num % 2) {  //this will return either 0 or 1
            case 0 -> System.out.println(num + " is a Even number");
            case 1 -> System.out.println(num + " is a Odd number");
//            case 0:
//                System.out.println(num + " is a Even number");
//                break;
//            case 1:
//                System.out.println(num + " is a Odd number");
        }

//        //Task10
//        int i = 65;
//        int result;
//        while(i>=23){
////        for (int i = 65; i >= 23; i--){
//            if (i % 2 == 0) {
//                result = 1;
//            } else {
//                result = 2;
//            }
//            switch (result) {
//                case 1 -> System.out.println("Even " + i + "+" + 12 + "=" + (i + 12));
//                case 2 -> System.out.println("Odd " + i + "+" + 25 + "=" + (i + 25));
//            }
//            i--;
//        }
    }
}
