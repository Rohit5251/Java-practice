import java.util.*;
public class update_ith_bit {
    public static int clear(int n ,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int update(int n,int i,int newBit){
        n=clear(n, i);
        int bitmask=newBit<<i;
        return n|bitmask;
    }
    public static void main(String args[]){
        System.out.println(update(15, 1, 0));
    }
}
