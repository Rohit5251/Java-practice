import java.util.*;
public class EvenOrOdd {
    public static void isOddOrEven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String args[]){
        isOddOrEven(3);
        isOddOrEven(4);
    }
}
