package Inheritance;

public class D extends C {
    String name;
    public D(String name, String  batch){
        super(batch);// By  default

        System.out.println("I am param constructor D");

        this.name = name;

    }
    public D(String name){
        System.out.println("I am param constructor D");
        this.name = name;
    }
    public D(){
        System.out.println("I am constructor D");
    }
}
