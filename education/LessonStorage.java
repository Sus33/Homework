package education;

public class LessonStorage {
    private Lesson[] lessons;
    private int size;

    public LessonStorage() {
        lessons = new Lesson[16];
    }

    public void add(Lesson lesson) {
        if (size == lessons.length) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] das = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, das, 0, lessons.length);
        lessons = das;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }
}