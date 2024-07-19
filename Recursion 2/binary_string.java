import java.util.*;
public class binary_string {

    public static void PString(int n,int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        PString(n-1, 0, str+"0");
        if(lastplace==0){
            PString(n-1, 1, str+"1");
        }
    }

    public static void main(String args[]){
        PString(10, 0, new String(""));
    }
}
