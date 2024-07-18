/**
 * decresing_num
 */
import java.util.*;
public class decresing_num {
    public static void Print_dec(int n){
        if(n==1){
            System.out.print("1");
            return;
        }
        System.out.print(n+" ");
        Print_dec(n-1);
    }
    public static void main(String args[]){
        int n=10;
        Print_dec(n);
    }
}