package stackUser;

import java.util.Arrays;

public class User {
    private final String[] users;

    private int top;

    public User(int size) {
        users = new String[size];
        top = -1;
    }

    void push(String item) {
        if (top < users.length - 1) {
            users[++top] = String.valueOf(item);
            System.out.println(Arrays.toString(users));
        } else {
            System.out.println("Stack is full");
        }
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        } else {
            System.out.println("The stack is not empty");
        }
        System.out.println("Removing " + Arrays.toString(peek()));
        return users[top--];
    }

    public String[] peek() {
        if (!isEmpty()) {
            return new String[]{users[top]};
        } else {
            System.exit(-1);
        }
        return users;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        return "User{" + "User='" + users + '\'' + ", cursor='" + top + '}';
    }
}
