public class permutation {

    public static void Per(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion

        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String Newstr=str.substring(0, i)+str.substring(i+1);
            Per(Newstr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str="abc";
        String ans="";

        Per(str, ans);
    }
}
