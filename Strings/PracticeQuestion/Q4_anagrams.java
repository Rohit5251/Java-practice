import java.util.*;
public class Q4_anagrams {
    public static boolean isAnagram(String str1,String str2){

        int count=0;
        if(str1.length()!=str2.length()){
            return false;
        }

        for(int i=0;i<str1.length();i++){
            char a=str1.charAt(i);
            for(int j=0;j<str2.length();j++){
                if(a==str2.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        if(count==str1.length()){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        String Str1="face";
        String str2="cafe";
        boolean b=isAnagram(Str1, str2);
        if(b==true){
            System.out.println("Two strings are anagrams");
        }
        else{
            System.out.println("They are not anagrams");
        }
    }
}
