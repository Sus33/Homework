package taskManagement;

public class TaskStorage {
    public void addTasks(String tasksStr) {

        Task tasks = new Task();
        String[] splitTask = tasksStr.split(", ");
        tasks.name = splitTask[0];
        tasks.description = splitTask[1];
        tasks.estimation = Double.parseDouble(splitTask[2]);
        tasks.id = Integer.parseInt(splitTask[3]);
    }

    // To Be continued...
    public void printTasks() {

    }
}
