package dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(6);
        dynamicArray.add(7);
        dynamicArray.add(74);
        dynamicArray.add(7);
        dynamicArray.add(9);
        dynamicArray.add(5);
        dynamicArray.add(4);
        dynamicArray.add(67);
        dynamicArray.add(89);
        dynamicArray.add(90);
        dynamicArray.add(69);
        dynamicArray.print();

        //Create second object.You can create as many objects as you want in DynamicArray.
        DynamicArray dy = new DynamicArray();
        System.out.println();
        dy.add(98);
        dy.print();
    }
}
