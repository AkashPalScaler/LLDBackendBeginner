package Constructors;

public class Exam {
    int exam_id;

    Exam(int exam_id){
        this.exam_id = exam_id;
    }

    Exam(Exam other){
        this.exam_id = other.exam_id;
    }
}
