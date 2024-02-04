package breakLoopsExample;

public class BreakLoop3 {
    public static void main(String[] args) {
        //Break
        NumberOne:
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 4 && j == 3) {
                    break NumberOne;
                }
                System.out.print(i + " " + j + " ");
            }
            System.out.println(i + " ");
        }

        //Continue
//        for (int i = 1; i <= 10; i++) {
//            if (i >= 4 && i <= 9) {
//                continue;
//            }
//            System.out.println(i);
//        }

        //Continue2
//        int i = 0;
//        int j = 1;
        // outer loop
//        while (i <= 3) {
//            System.out.println("Outer Loop: " + i);
        // inner loop
//            while (j <= 3) {
//                if (j == 2) {
//                    j++;
//                    continue;
//                }
//                System.out.println("Inner Loop: " + j);
//                j++;
//            }
//            i++;
//        }
    }
}
