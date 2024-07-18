import java.util.*;
public class last_occurance {
    public static int LastOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=LastOccurance(arr, key, i+1);

        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,3,2};
        System.out.println(LastOccurance(arr, 3, 0));
    }
}
