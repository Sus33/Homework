package bufferAndBuilder;

public class StringUtil {
    static int indexOf(String text, String search) {
        char[] textArr = text.toCharArray();
        char[] arr = search.toCharArray();
        int index = -1;
        start:
        for (int i = 0; i < textArr.length; i++) {
            if (i + arr.length > textArr.length) {
                break;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != textArr[i + j]) {
                    continue start;
                }
                if (j == arr.length - 1 && arr[j] == textArr[i + j]) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        StringUtil str = new StringUtil();
        System.out.println(str.trim("  java javac"));
        System.out.println(str.trim("java javac  "));
        System.out.println(str.trim("  java javac  "));
        System.out.println(indexOf("java php dart", "java"));
        System.out.println(indexOf("java php dart", "php"));
        System.out.println(indexOf("java php dart", "dartt"));
    }

    String trim(String text) {
        char[] arr = text.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (arr[start] == ' ') {
            start++;
            while (arr[end] == ' ') {
                end--;
            }
        }
        char[] strArray = new char[end - start + 1];
        int tmp = 0;
        for (int i = start; i <= end; i++) {
            strArray[tmp++] = arr[i];
        }
        return String.valueOf(strArray);
    }
}
//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