import java.util.*;
public class power_of_two {

    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }

    public static void main(String args[]){
        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(17));
    }
}
