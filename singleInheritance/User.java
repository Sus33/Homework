package singleInheritance;

public class User {
    String name;
    String surname;
    int age;

    public User() {

    }

    public static void addUsers(String name, String surname, int age) {
        User user = new User();
        user.name = name;
        user.surname = surname;
        user.age = age;
        System.out.println("User was successfully added: " + user.name + user.surname + user.age);
    }
}
