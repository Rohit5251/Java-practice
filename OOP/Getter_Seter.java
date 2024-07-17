import java.util.*;
public class Getter_Seter {
    public static void main(String args[]){
        PEN pen=new PEN();

        pen.setColor("Orange");
        System.out.println(pen.getColor());
        pen.setTip(352);
        System.out.println(pen.getTip());
    }
}


class PEN{
    private String color;
    private int tip;

    //SETTERS
    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }

    //GETTERS

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
}