package education;

public class StudentStorage {

    private Student[] students;
    private int size;

    public StudentStorage(int stu) {
        students = new Student[stu];
    }

    public StudentStorage() {
        students = new Student[10];
    }

    public void add(Student student) {
        if (size == students.length) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] student = new Student[students.length + 10];
        System.arraycopy(students, 0, student, 0, students.length);
        students = student;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }
}


