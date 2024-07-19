import java.util.*;
public class remove_dupl_in_string {
    public static void RString(String str,int idx, StringBuilder newString, boolean map[]){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char Currchar=str.charAt(idx);
        if(map[Currchar-'a']==true){
            RString(str, idx+1, newString, map);
        }else{
            map[Currchar-'a']=true;
            RString(str, idx+1, newString.append(Currchar), map);
        }
    }
    public static void main(String[] args) {
        String str="appnacollege";
        boolean map[] =new boolean[26];
        StringBuilder newString=new StringBuilder("");
        RString(str, 0, newString , map);
    }
}
