package AbstractClasses;

public abstract class Animal {
    int age;
    void die(){
        System.out.println("I am dying");
    }

    abstract void move(); //abstract
    abstract void attack();

}
