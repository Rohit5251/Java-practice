import java.util.*;
public class optimezed_power {

    public static int OP(int a,int n){
        if(n==0){
            return 1;
        }

        int p=OP(a, n/2);
        int ps=p * p;

        if(n % 2!=0){
            ps=a * ps;
        }

        return ps;
    }

    public static void main(String args[]){
        System.out.println(OP(2, 5));
    }
}
