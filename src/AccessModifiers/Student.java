package AccessModifiers;

public class Student {
    public String name;
    private int psp;
    protected String batch;
    int age;

    static int count;

    public static void main(String[] args) {
        Student s = new Student();
        s.count++;

        Student x = new Student();

        System.out.println(x.count);

        s.name = "Akash";


    }

    void doSomething(){
        this.name = "Akash";
        this.psp = 10;
        this.batch = "Feb23Morning";
        this.age = 20;
    }

}
