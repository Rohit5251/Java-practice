package Sorting;
import java.util.*;
public class bubbleSort {

    public static void BubbleSort(int arr[]){
        boolean swapped;
        for(int turn=0;turn<arr.length-1;turn++){
            swapped=false;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if (swapped == false)
            {
                System.out.println("Already sorted");
                break;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        BubbleSort(arr);
        printArray(arr);
    }
}
