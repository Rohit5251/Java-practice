/**
 * tiling_problem
 */
import java.util.*;
public class tiling_problem {

    public static int TilingProb(int n){
        //base case
        if(n==1 || n==0){
            return 1;
        }

        //vertical 
        int fnm1=TilingProb(n-1);

        //horizontal
        int fnm2=TilingProb(n-2);

        return fnm1+fnm2;
    }

    public static void main(String args[]){
        System.out.println(TilingProb(4));
    }
    
}