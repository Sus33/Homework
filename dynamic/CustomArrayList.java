package dynamic;

public class CustomArrayList {
    private int[] array;
    private int capacity;
    private int size;

    public CustomArrayList() {
        this(1);
    }

//    public CustomArrayList(){
//
//    }
    public CustomArrayList(int initialCapacity) {
        array = new int[initialCapacity];
        size = 0;
    }

    public static void main(String[] args) {
        CustomArrayList arr = new CustomArrayList();
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
        int[] newArray = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public void add(int value) {
        if (isFull()) {
            grow(capacity + capacity / 2 + 1);
        }
        array[size++] = value;
    }

    private boolean isFull() {
        return capacity == size;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Size is " + size + "  Capacity is " + capacity);
    }
}
