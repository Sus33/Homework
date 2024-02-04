package bufferAndBuilder;

import java.util.Arrays;

public class StringBuilderAndBuffer {
    public static void main(String[] args) {
        System.out.println(revers("Dollar"));
        System.out.println(replace("Dollar", 3, 6));
        System.out.println(subString(2, 4));
    }

    static String revers(String text) {
        char[] arr = text.toCharArray();
        String rev = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            rev += arr[i];
        }
        return rev;
    }

    static String replace(String text, int start, int end) {
        String arr = "";
        char[] arr1 = text.toCharArray();
        for (int i = start; i < end; i++) {
            arr1[i] = text.charAt(i);
            arr += arr1[i];
        }
        return arr;
    }

    static String subString(int start, int end) {
        String text = "Dollar";
        char[] strArray = text.toCharArray();
        char[] newStrArray = Arrays.copyOfRange(strArray, start, end);
        for (int i = start; i < end; i++) {
            strArray[i] = text.charAt(i);
            text += strArray[i];
        }
        return new String(newStrArray);
    }
}
