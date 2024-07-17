import java.util.*;
public class Constructor {
    public static void main(String args[]){
        Student std=new Student("Rohit");
    }
}

class Student{
    String name;
    int roll_no;

    Student(String name){
        System.out.println("This is from the constructor ....");
        this.name=name;
        System.out.println(name);
    }
}