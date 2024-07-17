import java.util.*;
public class Multilevel_inheritance {
    public static void main(String [] args){
        Dog tommy=new Dog();
        tommy.eats();
    }
}

class Animal{
    String color;

    void eats(){
        System.out.println("eats");
    }
}

class Mammal extends Animal{
    int legs;
    
}

class Dog extends Mammal{
    String breed;
}