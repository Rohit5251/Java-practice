import java.util.*;
public class kadanes {


    public static void sumSubarrayKadanes(int numbers []){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            currsum=currsum+numbers[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(maxsum, currsum);
        }
        if(maxsum==0){
            int big=Integer.MIN_VALUE;
            for(int i=0;i<numbers.length;i++){
                if(big<numbers[i]){
                    big=numbers[i];
                }
            }
            System.out.println("max sum is :"+big);
        }
        else{
            System.out.println("max sum is :"+maxsum);
        }
        
    }

    public static void main(String args[]){
        int numbers[]={-4,-5,-24,10};
        sumSubarrayKadanes(numbers);
    }
}
