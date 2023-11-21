package AccessModifiers;

public class Client extends UserChild {
    public void doSomething(){
        this.user_name ="Akash";
    }
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Akash"; //Accessable bcz public
       //s.psp=12; //Private is not accessible anywhere outside it's own class
        s.batch = "Feb23"; //protected is accessible anywhere inside class and package(Also outside package it is accessible but only through subclass)

        UserChild u = new UserChild();
//        u.user_name = "Akash";

//        protected is accessible anywhere inside class and package
//        (Also outside package it is accessible but only inside the subclass)
    }
}
