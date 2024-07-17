import java.util.*;
public class Inheritance {
    public static void main(String[] args){
        Fish f=new Fish();
        f.eats();
    }
}

class Animal{
    String color;

    void eats(){
        System.out.println("eats");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}