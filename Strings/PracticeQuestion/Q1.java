/**
 * Q1
 */
import java.util.*;;
public class Q1 {
    public static int count(String str){
        int z=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') && Character.isLowerCase(str.charAt(i)) ){
                z ++;
            }
        }
        return z;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the String :");
        String str=sc.nextLine();
        int c=count(str);
        System.out.println("total number of vowel which is in lower case is :"+c);
        //Q3
        String n=str.replace("i", "");
        System.out.println(n);
        
    }
}