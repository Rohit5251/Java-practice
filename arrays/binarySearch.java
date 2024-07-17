import java.util.*;
public class binarySearch {

    public static int BS(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        

        while (start<=end) {
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start =mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={10,23,25,30,36,38,42,47};
        int key=45;
        System.out.println(
            "hi"
        );
        System.out.println("index at :"+ BS(numbers,key));
    }
}
