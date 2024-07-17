import java.util.*;
public class subStrings {

    public static String sub(String str,int si,int ei){
        String s1="";
        for(int i=si;i<ei;i++){
            s1+=str.charAt(i);
        }
        return s1;
    }

    public static void main( String args[]){
        String str="HelloWorld";
        System.out.println(sub(str, 0, 5));
        System.out.println(str.substring(0,5));//inbuilt
    }
}
