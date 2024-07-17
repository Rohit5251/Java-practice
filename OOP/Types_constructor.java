import java.util.*;
public class Types_constructor {
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student("Rohit");
        Student s3=new Student(123);
    }
}

class Student{
    String name;
    int roll;
    Student(){
        System.out.println("This is non parametrized constructor ");
    }

    Student(String name){
        this.name=name;
        System.out.println(this.name);
    }

    Student(int roll){
        this.roll=roll;
        System.out.println(this.roll);
    }
}
