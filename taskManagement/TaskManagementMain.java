package taskManagement;

import java.util.Scanner;

public class TaskManagementMain {
    static final Scanner SCANNER = new Scanner(System.in);
    private static final UserStorage USER_STORAGE = new UserStorage();
    private static final TaskStorage TASK_STORAGE = new TaskStorage();

    // Version1
    public static void main(String[] args) {
        addUsers();
        addTasks();
    }

    private static void addUsers() {
        System.out.println("Please input Users data: ");
        String usersStr = SCANNER.nextLine();
        USER_STORAGE.addUser(usersStr);
        System.out.println("User was successfully added");
        System.out.println(usersStr);
    }
    private static void addTasks() {
        System.out.println("Please input Tasks: ");
        String tasksStr = SCANNER.nextLine();
        TASK_STORAGE.addTasks(tasksStr);
        System.out.println("Task was successfully added");
        System.out.println(tasksStr);
    }
}

