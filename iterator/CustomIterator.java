package iterator;

import java.util.Iterator;

public class CustomIterator<T> implements Iterator {

    private final T[] arr;
    int currentIndex;
    int maxSize;

    public CustomIterator(T[] array) {
        this.arr = array;
        this.currentIndex = 0;
    }

    public static void main(String[] args) {
        String[] str = new String[]{"Hi", "Everyone"};
        if (str.length <= 0) {
            throw new NoSuchElementException("Not found!!!");
        } else {
            for (String s : str) {
                System.out.println("Found Element is " + s);
            }
        }
    }

    @Override
    public boolean hasNext() {
        return currentIndex < maxSize && arr[currentIndex] != null;
    }

    @Override
    public T next() {
        return arr[currentIndex++];
    }

    @Override
    public void remove() {
        for (int i = currentIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }
}

class NoSuchElementException extends RuntimeException {
    public NoSuchElementException(String message) {
        super(message);
    }
}
