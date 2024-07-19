import java.util.*;
public class Q2 {

    public static String str[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void NumtoStr(int num){
        if(num==0){
            return;
        }

        int lastdigit=num%10;
        NumtoStr(num/10);
        System.out.print(str[lastdigit]+" ");
    }

    public static void main(String[] args) {
        NumtoStr(12340);
    }
}
