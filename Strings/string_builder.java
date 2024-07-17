import java.util.*;
public class string_builder {
    public static void main(String args[]){
        StringBuilder sr=new StringBuilder("");

        for(char ch='a';ch<='z';ch++){
            sr.append(ch);
        }
        System.out.println(sr);
    }
}
