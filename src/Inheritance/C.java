package Inheritance;

public class C extends B {
    String batch;
    public C(String batch){
        System.out.println("I am param constructor C");
        this.batch = batch;
        this.doSomething();
    }
    public C(){
        System.out.println("I am constructor C");
    }
    void doSomething(){

    };
}
