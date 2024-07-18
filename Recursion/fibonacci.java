import java.util.*;
public class fibonacci {
    public static int Fib(int n){
        if(n==1 || n==0){
            return n;
        }

        int fib1=Fib(n-1);
        int fib2=Fib(n-2);
        return fib1+fib2;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(Fib(n));
    }
}
