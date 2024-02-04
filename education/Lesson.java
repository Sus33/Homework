package education;

public class Lesson {
    private String name;
    private int duration;
    private int price;
    private String lecturerName;

    public Lesson(String name, int duration, int price, String lecturerName) {
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.lecturerName = lecturerName;
    }

    public Lesson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", price=" + price + '\'' +
                ", lecturerName =" + lecturerName + '\'' +
                '}';
    }
}
