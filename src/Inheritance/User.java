package Inheritance;

public class User {
    public int user_id;
    protected String user_name;
    private int age;
    int dob;

    public int getAge(){
        onlyUserCanUse();
        return age;
    }

    private void onlyUserCanUse(){

    }
}
