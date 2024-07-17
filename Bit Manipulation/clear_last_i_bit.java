import java.util.*;
public class clear_last_i_bit {

    public static int clear (int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }

    public static int update(int n,int i,int newBit){
        n=clear(n, i);
        int bitmask=newBit<<i;
        return n|bitmask;
    }
    //my solution
    public static int clearIBit(int n,int i){
        int k=n;
        for(int j=0;j<i;j++){
            k=update(k, j, 0);
        }
        return k;
    }

    //teacher solution
    public static int clearIBit2(int n,int i){
        int bitMask=(~0)<<i;
        return n&bitMask;
    }

    public static void main(String args[]){
        System.out.println(clearIBit(15, 2));
        System.out.println(clearIBit2(15, 2));
    }
}
