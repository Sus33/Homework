package abstarctclass;

public class PersonMain {
    public static void main(String[] args) {
        System.out.println("This is data of person!!!");
        // Declaring abstract class reference equal to subclass objects.
        Identity person = new Person();
        person.getName("Jon");
        person.getSurname("Jonson");
        person.getGender("MALE");
        person.getCity("Ottawa");
        // person.getCountry("Canada");
        // Compile-time error, because we can't access newly added method in subclass using superclass reference.
        Person per = new Person();
        per.getCountry("Canada");
    }
}
