public class find_substets {

    public static void findSubset(String str,int i,String ans){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.print("null ");
            }else{
                System.out.print(ans+" ");
            }
            return;
        }

        //yes case
        findSubset(str, i+1, ans+str.charAt(i));

        //no case
        findSubset(str, i+1, ans);
    }

    public static void main(String[] args) {
        String str="ab";
        String ans="";
        findSubset(str, 0, ans);

    }
}
