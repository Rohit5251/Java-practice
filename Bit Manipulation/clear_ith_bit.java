import java.util.*;
public class clear_ith_bit {
    public static int clearIthbit(int n,int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearIthbit(10, 1));
    }
}
