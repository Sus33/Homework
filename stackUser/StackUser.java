package stackUser;

public class StackUser {
    public static void main(String[] args) {
        User user = new User(3);
        user.push("Sus");
        user.push("David");
        user.push("Laura");
        user.push("Sur");

        user.pop();
        user.pop();
        user.pop();
        user.pop();
    }
}
