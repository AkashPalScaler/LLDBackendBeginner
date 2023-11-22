package Interfaces;

public class Dog extends Animal implements Runner,Protector{
    String name;

    void bark(){
        System.out.println("Woof woof!");
    }

    @Override
    public void run(){
        System.out.println("I can run like a dog");
    }
    @Override
    public String protect(){
        return "I am loyal protector";
    }
}
