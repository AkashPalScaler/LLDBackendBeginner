package Static;

public class Animal {
    int age;
    static int count;

    public Animal(){
        count++;
    }

    public void doSomething(){
        Animal s = new Animal();
        s.age = 10;
//        this.age = 10;//Non static members can't be accessed by static
        System.out.println("I am a general animal");
    }

    public void checkSomething(){

        doSomething();
        count = 1; // Static members can be accessed inside non static
    }
}
