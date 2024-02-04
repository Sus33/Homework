package first;

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        int n;
        double res;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers to calculate average");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter   " + n + "  Numbers");

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        res = Average.calAvg(a, n);
        System.out.println("Average = " + res / n);
    }

    static double calAvg(int[] a, int n) {
        double res = 0;
        for (int i = 0; i < n; i++)
            res = res + a[i];
        return res;
    }
}
