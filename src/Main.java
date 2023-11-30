class Animal{
    String name ="Animal";
    void something(){
        System.out.println("Something animal");
    }
}
class Dog extends Animal{
    String name = "Dog";
    void something(){
        System.out.println("Something dog");
    }
}
public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
        System.out.println(d.name);
        d.something();
        Animal a  =d;
        System.out.println(a.name);
        a.something();
        System.out.println("Hello World!");
    }
}
