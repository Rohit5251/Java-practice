import java.util.*;
public class search_in_roteted_sorted_array {

    public static int Search(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }

        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }

        //mid lies On l1
        if(arr[si]<=arr[mid]){

            //left part of L1
            if(arr[si]<=tar && tar<=arr[mid]){
                return Search(arr, tar, si, mid-1);
            }
            //right of mid
            else{
                return Search(arr, tar, mid+1, ei);
            }
        }

        //mid lies on L2
        else{
            //tar lies on Right part of L2
            if(arr[mid]<=tar && tar<=arr[si]){
                return Search(arr, tar, mid+1, ei);
            }
            //tar lies on left part of L2
            else{
                return Search(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        
        System.out.println(Search(arr, 0, 0, arr.length-1));
    }
}
