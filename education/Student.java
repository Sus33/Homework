package education;

public class Student {
    private String name;
    private String surname;
    private String phone;
    private String email;
    private String ID;
    private Lesson[] lessons;

    public Student(String name, String surname, String phone, String email, String ID, Lesson[] lessons) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.ID = ID;
        this.lessons = lessons;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Lesson[] getLessons() {
        return lessons;
    }

    public void setLessons(Lesson[] lessons) {
        this.lessons = lessons;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", phone=" + phone + '\'' + ", email =" + email + '\'' + ", id=" + ID + '}';
    }
}
