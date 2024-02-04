package dynamic;

public class CustomArray {
    private final int DEFAULT_CAPACITY = 10;
    private int[] array;
//    private int capacity;
    private int size;

    public CustomArray() {
        this(1);
    }

    //    public CustomArrayList(){
//
//    }
    public CustomArray(int initialCapacity) {
        array = new int[initialCapacity];
        size = 0;
    }

    public static void main(String[] args) {
        CustomArray arr = new CustomArray();
        System.out.print("Add 1, ");
        arr.add(1);
        arr.print();

        System.out.print("Add 2, ");
        arr.add(2);
        arr.print();

        System.out.print("Add 3, ");
        arr.add(3);
        arr.print();

        System.out.print("Add 4, ");
        arr.add(4);
        arr.print();

        System.out.print("Add 5, ");
        arr.add(5);
        arr.print();
    }

    private void grow(int newCapacity) {
        if (newCapacity > array.length && newCapacity <= DEFAULT_CAPACITY) {
            int[] newArray = new int[newCapacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
                size = newCapacity;
                array = newArray;
            }
        }
    }

    public void add(int value) {
        if (isFull()) {
            grow(array.length + array.length/ 2 + 1);
        }
        size++;
    }

    private boolean isFull() {
        return DEFAULT_CAPACITY == size;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Size is " + size + "  Capacity is " + DEFAULT_CAPACITY);
    }
}

