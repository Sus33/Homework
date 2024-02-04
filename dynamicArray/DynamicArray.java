package dynamicArray;

public class DynamicArray {

    int[] array = new int[10];
    int size;

    DynamicArray() {
        size = 0;
    }

    void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    void extend() {
        int[] tmp = new int[array.length + 10];
        if (size >= 0) System.arraycopy(array, 0, tmp, 0, size);
        array = tmp;
    }

    int getByIndex(int index) {
        return array[index];
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    ///New methods
    public int max() {
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int min() {
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public void deleteByIndex(int index) {
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    public int[] subArray(int startIndex, int endIndex) {
        int[] tmp = new int[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            tmp[index++] = array[i];
        }
        return tmp;
    }

    public int[] subArray(int startIndex) {
        return subArray(startIndex, size - 1);
    }

    public void deleteByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                deleteByIndex(i);
            }
        }
    }
}
