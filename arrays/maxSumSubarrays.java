import java.util.*;
public class maxSumSubarrays {

    public static void sumSubarray(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i+1;j<numbers.length;j++){
                currsum=0;
                int end=j;
                for(int k=start;k<=end;k++){
                    currsum+=numbers[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max sum of the subarray is :"+ maxsum);
    }

    public static void main(String args[]){
        int numbers[]={3,4,53,24,55,200};
        sumSubarray(numbers);
        
    }
}