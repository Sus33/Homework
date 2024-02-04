
public class Combinations {
    private final String inputString;
    private final StringBuilder output = new StringBuilder();

    public Combinations(final String str) {
        inputString = str;
        System.out.println("String is: " + inputString);
    }

    public static void main(String[] args) {
        Combinations comb = new Combinations("Cat");
        System.out.println("Combinations are: ");
        comb.combine();
    }

    public void combine() {
        combine(0);
    }

    private void combine(int start) {
        for (int i = start; i < inputString.length(); ++i) {
            output.append(inputString.charAt(i));
            System.out.println(output);
            combine(i + 1);
            output.setLength(output.length() - 1);
        }
    }
}
