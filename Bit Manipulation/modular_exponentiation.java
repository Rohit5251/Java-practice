import java.util.*;
public class modular_exponentiation {

    //Given three numbers x, y and p, compute (a^n) % p. 
    public static int ModularExponentiation(int a,int n,int p){
        int ans=1;

        while (n>0) {
            if((n&1)!=0){
                ans=ans*a;
            }

            a=a*a;
            n=n>>1;
        }
        return ans%p;
    }

    public static void main(String args[]){
        System.out.println(ModularExponentiation(2, 5, 13));
    }
}
