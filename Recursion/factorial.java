import java.util.*;
public class factorial {
    public static int Fact(int n){
        if(n==1){
            return 1;
        }
        int fn1=Fact(n-1);
        int fn=n*fn1;
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Fact(n));
    }
}
