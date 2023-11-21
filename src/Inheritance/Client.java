package Inheritance;

public class Client {
    public static void main(String[] args) {
        User u = new User();
//        u.age =12;
        Student s = new Student();
//        s.age = 12;
        s.getAge();
        System.out.println("Hello");


//        D d = new D();
        D d1 = new D("Daniel", "Feb23");
    }
}
