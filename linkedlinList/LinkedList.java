package linkedlinList;

public class LinkedList<E> {
    private int size;
    private Node head;
    private Node tail;

    public LinkedList() {
        size = 0;
        head = tail = null;
    }
    private Node findIndex(int index) {
        Node element = head;
        for (int i = 0; i < index; i++)
            element = element.getNext();
        return element;
    }

     public int getSize(){
        return this.size;
     }

     public boolean isEmpty(){
        return this.size == 0;
     }

    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Error index greater than the size!!!");
            return -1;
        }
        return findIndex(index).getValue();
    }
    public int replace(int index, E value){
        if (index >= size || index < 0) {
            System.out.println("Error index greater than the size!!!");
            return -1;
        }
        Node newObj = new Node((Integer) value, null, null);
        Node element = findIndex(index);
        if (index == 0){
            newObj.setPrev(element.getPrev());
            newObj.setNext(element.getNext());
            element.getNext().setPrev(newObj);
            head = newObj;
        } else if (index == size - 1) {
            newObj.setPrev(element.getPrev());
            newObj.setNext(element.getNext());
            element.getPrev().setNext(newObj);
            tail = newObj;
        }else{
            newObj.setPrev(element.getPrev());
            newObj.setNext(element.getNext());
            element.getPrev().setNext(newObj);
            element.getNext().setPrev(newObj);
        }
        return element.getValue();
    }

    public void add(E value){
        Node newObj = new Node((Integer) value, null, null);
        if (head == null){
            head = newObj;
        }else {
            tail.setNext(newObj);
            newObj.setPrev(tail);
        }
        tail = newObj;
        size++;
    }
    public void addTheValueToTheHead(E value) {
        Node newNode = new Node((Integer) value, head);
        if (size == 0) {
            head = tail = newNode;
        } else {
            head = newNode;
        }
        size++;
    }
    public void addTheValueToTheTail(E value) {
        Node newNode = new Node((Integer) value);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void insert(int index, E value) {
        if (index < 0 || index > size) {
            System.out.println("Error index greater than the size!!!");
            return;
        }
        Node element = findIndex(index - 1);
        Node newObj = new Node((Integer) value, element.next);
        if (index == 0) {
            addTheValueToTheHead(value);
        } else if (index == size) {
            addTheValueToTheTail(value);
        } else {
            element.getPrev().setNext(newObj);
            newObj.setPrev(element.getPrev());
            newObj.setNext(element);
            element.setPrev(newObj);
        }
        size++;
    }
    public void removeByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Error! ");
            return;
        }
        Node element = findIndex(index - 1);
        element.next = element.next.next;
        if (size == 1) {
            head = tail = null;
        } else if (index == 0) {
            head = head.next;
        } else {
            if (index == size - 1) {
                tail = element;
            }
            size--;
        }
    }
    public int removeByValue(int value){
        Node element = head;
        for (int i = 0; i < size; i++) {
            if (element.getValue() == value) {
                removeByIndex(i);
            }
            element = element.getNext();
        }
        return value;
    }
    public void print(){
      Node element = this.head;
        System.out.print("[");
        for (int i = 0; i <this.size - 1; i++) {
            System.out.print(element.getValue() + ",");
            element = element.getNext();
        }
        System.out.println(element.getValue() + "]");
        System.out.println();
    }
    private static class Node {
        private int value;
        private Node next;

        private Node prev;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        public Node(int value, Node next,Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getPrev() {
            return prev;
        }
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addTheValueToTheHead(1);
        list.print();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.print();
        System.out.println(list.getSize());
        list.insert(2,2);
        list.print();
        list.addTheValueToTheTail(7);
        list.print();
        list.removeByIndex(3);
        list.print();
        list.removeByValue(5);
        list.print();
        list.replace(2,11);
        list.print();
        System.out.println(list.isEmpty());
        list.print();
    }
}
