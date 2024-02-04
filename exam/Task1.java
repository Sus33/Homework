package exam;

public class Task1 {
    public static void main(String[] args) {

        int[] array = {1, 45, 67, 89, 76, 754, 76};
        minMaxNumber(array);
        average(array);
    }

    public static void minMaxNumber(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            else if (array[i] < min) min = array[i];
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
    }

    public static void average(int[] array) {
        float sum = 0;
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }
        float average = (sum / array.length);
        System.out.println("Average : " + average);
    }
}
