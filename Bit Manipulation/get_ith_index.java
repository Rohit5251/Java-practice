import java.util.*;
public class get_ith_index {
    public static int getiIndex(int n ,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println(getiIndex(10, 2));
        System.out.println(getiIndex(10, 3) );
    }
}
