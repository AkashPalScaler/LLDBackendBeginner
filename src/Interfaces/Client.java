package Interfaces;

public class Client {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
        System.out.println(d.protect());
        System.out.println("Hello");
    }

}
