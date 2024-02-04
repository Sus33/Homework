package bufferAndBuilder;

public class SearchCountOfWords {
    public static void main(String[] args) {
        String input = "java php java js c# java c#";
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (words[i] != "0" && count > 1) {
                System.out.println(words[i] + " -> " + count);
            }
        }
    }
}