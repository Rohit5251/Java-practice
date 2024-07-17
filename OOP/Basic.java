/**
 * Basic
 */
import java.util.*;
public class Basic {
    public static void main(String args[]){
        Pen p1=new Pen();//created pen obj called p1
        p1.changeColor("Blue");
        System.out.println(p1.color);
        p1.changeTip(8);
        System.out.println(p1.tip);
    }
    
}

class Pen{
    String color;
    int tip;

    void changeColor(String newColor){
        color=newColor;
    }

    void changeTip(int newTip){
        tip=newTip;
    }
}