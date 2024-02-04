package myBlog;

public class UserStorage extends User {
    private User[] users;
    private int size;

    @Override
    public void printAllUsers() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }
}
