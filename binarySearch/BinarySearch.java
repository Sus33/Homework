package binarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int start, int end, int key) {
        int middle = start + (end - start) / 2;
        if (end >= start && arr[middle] == key) {
            return middle;
        } else if (arr[middle] > key) {
            return binarySearch(arr, start, middle - 1, key);
        } else {
            return binarySearch(arr, middle + 1, end, key);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 8, 9, 11, 22, 23, 28, 32};
        int key = 22;
        int end = arr.length - 1;
        int result = binarySearch(arr, 0, end, key);
        if (result == -1) {
            System.out.println("Item Not Found!!!");
        } else {
            System.out.println("Item Index is " + result);
        }
    }
}
