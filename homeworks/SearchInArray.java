package homeworks;

public class SearchInArray {
    public static void main(String[] args) {
        // Task 1
        // 1.1 Create an array of arbitrary length (minimum 10).
        // 1.2 Then initialize the array with arbitrary words.
        // 1.3 Then use for each to find an arbitrary word from that array.
        // 1.4 If found, stop the cycle.
        // 1.5 At the end, print whether that word was present or not.

        String[] stringArray2 = new String[10];
        String countries = "Susanna";
        Boolean bool = false;
        stringArray2[0] = "Armenia";
        stringArray2[1] = "Egypt";
        stringArray2[2] = "Cambodia";
        stringArray2[3] = "Austria";
        stringArray2[4] = "China";
        stringArray2[5] = "USA";
        stringArray2[6] = "Russia";
        stringArray2[7] = "Franc";
        stringArray2[8] = "Belgium";
        stringArray2[9] = "Cyprus";

        for (String item : stringArray2) {
            if (item == countries) {
                bool = true;
                break;
            }
        }
        String result = bool ? "Has word" : "Hasn't the word";
        System.out.println(result);

        //Task 2
        // 2.1 Create an array.
        // 2.2 Then initialize the array with these numbers: 4, 5, 6, 7, 8, 9, 10, 6,
        // 60, 6, 46, 67, 16, 63, 6, 16, 6, 46, 6, 6, 4, 7, 99, 1, 1, 1, 13.
        // 2.3 Then use for each to find out separately how many of the numbers 6, 1, 13, 17, 93 are in the array.
        // 2.4 At the end, print whether that number was available or not, if it was available, then how many.

//        int[] arr = {4, 5, 6, 7, 8, 9, 10, 6, 60, 6, 46, 67, 16, 63, 6, 16, 6, 46, 6, 6, 4, 7, 99, 1, 1, 1, 13};
//        int has = 1;
//        int count = 0;
//        for (int num : arr) {
//            if (num == has) {
//                count += 1;
//            }
//        }
//        String result = (count > 0) ? String.valueOf(count) : "No match found";
//        System.out.println(result);
    }
}
