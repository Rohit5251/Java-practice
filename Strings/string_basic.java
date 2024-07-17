/**
 * string_basic
 */
import java.util.*;
public class string_basic {
    public static void printString(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first letter :");
        String firstLetter=sc.nextLine();
        System.out.print("Enter the Last name:");
        String lastName=sc.nextLine();
        String fullName=firstLetter+" "+ lastName;
        System.out.println(fullName);

        int length=fullName.length();
        System.out.println(length);

        printString(fullName);
    }
}