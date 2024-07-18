import java.util.*;
public class incresing_num {
    protected static void Print_inc(int n){
        if(n==1){
            System.out.print("1 ");
            return;
        }
        Print_inc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        Print_inc(n);
    }
}
