import java.util.*;
public class sum_natural_num {
    public static int Nsum(int n){
        if(n==1){
            return 1;
        }
        int a=n + Nsum(n-1);
        return a;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Nsum(n));
    }
}
