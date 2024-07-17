import java.util.*;
public class Copy_constructor {
    public static void main(String args[]){
        student s1=new student();
        s1.name="Rohit";
        s1.roll=324;
        s1.pass="abcd";
        s1.marks[0]=45;
        s1.marks[1]=56;
        s1.marks[2]=86;
        student s2=new student(s1);
        s2.pass="xyz";
        s1.marks[2]=100;
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.pass);
        System.out.println(s2.marks[2]);

    }
}
class student{
    String name;
    int roll;
    String pass;
    int marks[]=new int[3];
    student(){
        
    }
    //shallow copy constructor
    // student(student s1){
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }

    //deep copy constructor
    student(student s1){
        int marks[]=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }
    }
}