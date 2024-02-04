package string;

import java.util.Arrays;

public class StringUtil {
    private static final String TEXT = "";

    static String subString(String text, int fromIndex, int toIndex) {
        int length = text.length();
        if (fromIndex < 0) {
            fromIndex += length;
            if (toIndex == 0) {
                toIndex = length;
            }
        }
        if (toIndex < 0) {
            toIndex += length;
        }
        if (toIndex < fromIndex) {
            int tmp = fromIndex;
            fromIndex = toIndex;
            toIndex = tmp;
        }
        if (fromIndex == toIndex) {
            return TEXT;
        }
        char[] strArray = text.toCharArray();
        char[] newStrArray = Arrays.copyOfRange(strArray, fromIndex, toIndex);
        return new String(newStrArray);
    }

    static String reverse(String text) {
        char[] textArray = text.toCharArray();
        String reverseString = "";
        for (int i = textArray.length - 1; i >= 0; i--) {
            reverseString += textArray[i];
        }
        return reverseString;
    }

    public static void main(String[] args) {
//      String text = "difficult";
//      System.out.println(text.substring(2,5));
//      System.out.println(text.substring(0,3));
        System.out.println(subString("difficult", 2, 5));
        System.out.println(subString("difficult", 0, 3));
        System.out.println(reverse("123456"));
    }
}
