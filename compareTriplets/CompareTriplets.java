package compareTriplets;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public static void compareTriplets() {
        List<Integer> a = new ArrayList<>();
        a.add(17);
        a.add(28);
        a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(99);
        b.add(16);
        b.add(8);
        List<Integer> scores = new ArrayList<>();
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < b.get(i)) {
                ++aliceScore;
            } else if (b.get(i) < a.get(i)) {
                ++bobScore;
            }
        }
        scores.add(aliceScore);
        scores.add(bobScore);
        System.out.println(scores);
    }

    public static void main(String[] args) {
        CompareTriplets.compareTriplets();
    }
}
