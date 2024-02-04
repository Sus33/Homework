package homeworks;

public class Triangles {
    public static void main(String[] args) {
//     1.      *
//            * *
//           * * *
//          * * * *
//         * * * * *
//        * * * * * *

        for (int i = 0; i < 6; i++) {
            for (int j = 6 - i; j > 1; j--) {
                System.out.print(" ");
            }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
        }

//    2.  *
//        **
//        ***
//        ****
//        *****

//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//       3.         *
//                 **
//                ***
//               ****

        for (int m = 0; m < 4; m++) {
            for (int n = 4; n > m; n--) {
                System.out.print("  ");
            }
            for (int n = 0; n <= m; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//     4. * * * *
//        * * *
//        * *
//        *

//        for (int i = 4; i > 0 ; i--) {
//           for (int j = i; j > 0; j--) {
//            System.out.print("* ");
//         }
//         System.out.println();
//    }

//     5. * * * *
//          * * *
//            * *
//              *

//          for (int m = 0; m < 4; m++) {
//            for (int n = 0; n < m; n++) {
//                System.out.print("  ");
//            }
//            for (int n = 4; n > m; n--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//     6.     *
//           * *
//          * * *
//         * * * *
//          * * *
//           * *
//            *

        for (int k = 0; k < 4; k++) {
            for (int l = 4; l > k ; l--) {
                System.out.print(" ");
            }
            for (int l = 0; l <= k ; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l <= k ; l++) {
                System.out.print(" ");
            }
            for (int l = 3; l > k ; l--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
