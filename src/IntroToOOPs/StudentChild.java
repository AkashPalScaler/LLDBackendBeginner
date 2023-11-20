package IntroToOOPs;

import AccessModifiers.Student;

public class StudentChild extends Student {
    int id;

    void doSomething(){
        this.name = "Akash";
//        this.psp = 10; //Default is accessible no where outside class/package
        this.batch = "Feb23Morning"; //Protected is accessible inside child class
//        this.age = 20; //Private
    }
}
