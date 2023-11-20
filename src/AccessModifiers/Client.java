package AccessModifiers;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Akash"; //Accessable bcz public
       //s.psp=12; //Private is not accessible anywhere outside it's own class
        s.batch = "Feb23"; //protected is accessible anywhere inside class and package(Also outside package it is accessible but only through subclass)

    }
}
