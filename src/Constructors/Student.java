package Constructors;

public class Student {
    int age;
    int psp;
    String name;
    Exam sql_exam;

    Student(){
        this.name = "Akash";
        this.psp = 10;
        this.age = 100;
    }

    Student(String name){
        this.name = name;
    }

    Student(String name, int age, int psp){
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    Student(String name, int age, int psp, int exam_id){
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.sql_exam = new Exam(exam_id);
    }

    Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.psp = other.psp;
        this.sql_exam = new Exam(other.sql_exam);
    }
}
