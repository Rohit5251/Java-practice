import java.util.*;
public class friends_problem {

    public static int FP(int n){
        if(n==1 || n==2){
            return n;
        }
        return FP(n-1)+ (n-1)*FP(n-2);
    }

    public static void main(String[] args) {
        System.out.println(FP(15));
    }
}
