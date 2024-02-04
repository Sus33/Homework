package stack;

import java.util.Arrays;

public class Stack extends User {
    private final User[] users;

    private int top;

    public Stack(int size) {
        users = new User[size];
        top = -1;
    }

    void push(User user) {
        if (top < users.length - 1) {
            users[++top] = user;
        } else {
            System.out.println("Stack is full");
        }
    }

    public User pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        } else {
            System.out.println("The stack is not empty");
        }
        System.out.println("Removing " + Arrays.toString(peek()));
        return users[top--];
    }

    public User[] peek() {
        if (!isEmpty()) {
            return new User[]{users[top]};
        } else {
            System.exit(-1);
        }
        return users;
    }

    private boolean isEmpty() {
        return top == -1;
    }
}
