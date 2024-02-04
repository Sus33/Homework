package education;

import java.util.Scanner;

public class EducationCenterMain implements Commands {
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean search = true;
        while (search) {
            printCommands();
            String commandStr = scanner.nextLine();
            int command;
            command = Integer.parseInt(commandStr);

            switch (command) {
                case EXIT -> {
                    search = false;
                    System.out.println("Exit");
                }
                case ADD_STUDENT -> addStudent();
                case ADD_LESSON -> addLesson();
                case PRINT_STUDENTS -> studentStorage.print();
                case PRINT_LESSONS -> lessonStorage.print();
                default -> System.err.println("Wrong case");
            }
        }
    }

    private static void addLesson() {
        System.out.println("Input task details: (name, duration, price, lecturerName) ");
        String lessonData = scanner.nextLine();
        String[] lessonDataStr = lessonData.split(", ");
        Lesson lesson = new Lesson();
        lesson.setName(lessonDataStr[0]);
        lesson.setDuration(Integer.parseInt(lessonDataStr[1]));
        lesson.setPrice(Integer.parseInt(lessonDataStr[2]));
        lesson.setLecturerName(lessonDataStr[3]);
        lessonStorage.add(lesson);
    }

    private static void addStudent() {
        lessonStorage.print();
        System.out.println("Input student data: (name, surname, phone, email, ID)");
        String studentData = scanner.nextLine();
        String[] studentDataStr = studentData.split(",");
        Student student = new Student();
        student.setName(studentDataStr[0]);
        student.setSurname(studentDataStr[1]);
        student.setPhone(studentDataStr[2]);
        student.setEmail(studentDataStr[3]);
        student.setID(studentDataStr[4]);
        studentStorage.add(student);
    }

    private static void printCommands() {
        System.out.println("Input " + EXIT + " for exit");
        System.out.println("Input " + ADD_STUDENT + " add students");
        System.out.println("Input " + ADD_LESSON + " add tasks");
        System.out.println("Input " + PRINT_STUDENTS + " print all users");
        System.out.println("Input " + PRINT_LESSONS + " print all tasks");
    }

}
