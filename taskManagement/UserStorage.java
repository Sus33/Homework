package taskManagement;

public class UserStorage extends User {
    public void addUser(String usersStr) {

        User user = new User();
        String[] splitUser = usersStr.split(", ");
        user.name = splitUser[0];
        user.surname = splitUser[1];
        user.gender = Gender.valueOf(splitUser[2]);
        user.age = Integer.parseInt(splitUser[3]);
        user.userId = Integer.parseInt(splitUser[4]);
    }

    // to Be Continued....
    public void printUsers() {

    }
}

