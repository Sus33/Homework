package first;

public class Find {
    public static void main(String[] args) {
        int[] array = {98, 43, 1, 100, 35, 23};
        findMinAndMaxNumbers(array);
        findAverage(array);
    }

    public static void findMinAndMaxNumbers(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            else if (array[i] < min) min = array[i];
        }
        System.out.println("Maximum Number is " + max);
        System.out.println("Minimum Number is " + min);
    }

    static void findAverage(int[] array) {
        int length = array.length;
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        int average = sum / length;

        System.out.println("Average of array : " + average);
    }
}
