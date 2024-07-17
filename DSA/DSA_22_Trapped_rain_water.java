/**
 * DSA_22_Trapped_rain_water
 */
import java.util.*;
public class DSA_22_Trapped_rain_water {

    public static int[] leftMaxBoundary(int arr[]){
        int lmb[]=new int[arr.length];

        lmb[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            lmb[i]=Math.max(lmb[i-1], arr[i]);
        }
        return lmb;
    }
    public static int[] rightMaxBoundary(int arr[]){
        int rmb[]=new int[arr.length];

        rmb[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rmb[i]=Math.max(rmb[i+1],arr[i]);
        }
        return rmb;
    }
    public static void evaluate(int lmb[],int rmb[],int arr[]){
        int total=0;
        int temp;
        for(int i=0;i<lmb.length;i++){
            temp=Math.min(lmb[i], rmb[i]);
            total=total+temp-arr[i];
        }
        System.out.println("Total Water trapped :"+total);
    }

    public static void main(String args[]){
        int arr[]={4,2,0,6,3,2,5};
        int left[]=leftMaxBoundary(arr);
        int right[]=rightMaxBoundary(arr);
        evaluate(left, right, arr);

    }
    
}