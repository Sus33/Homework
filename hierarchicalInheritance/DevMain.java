package hierarchicalInheritance;

public class DevMain {
    public static void main(String[] args) {
        Gaming gm = new Gaming();
        Mobile mob = new Mobile();
        Web web = new Web();
        gm.codding(); // extends Developer
        gm.print();   // Method of class Gaming
        mob.learning(); //extends Developer
        mob.show();  // Method of class Mobile
        web.codding(); // extends Developer
        web.openPage();  // Method of class Web
    }
}
