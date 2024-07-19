import java.util.*;
public class Q3 {

    public static int StrLength(String str){
        if(str.length()==0){
            return 0;
        }

        return StrLength(str.substring(1))+1;
    }

    public static void main(String[] args) {
        
        System.out.println(StrLength("Hello"));
    }
}
