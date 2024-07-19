/**
 * Q1
 */
import java.util.*;
public class Q1 {

    public static void Occurance(int arr[],int i,int key){
        if(i==arr.length){
            System.out.println("");
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
            
        }
        Occurance(arr, i+1, key);
    }

    public static void main(String[] args) {
        int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        Occurance(arr, 0, 2);
    }
    
}