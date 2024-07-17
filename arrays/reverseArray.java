import java.util.*;
public class reverseArray {

    public static void reverse(int numbers[]){
        int f=0;
        int l=numbers.length-1;

        while (f<l) {
            int temp=numbers[l];
            numbers[l]=numbers[f];
            numbers[f]=temp;

            f++;
            l--;
        }
    }
    public static void main(String args[]){
        int numbers[]={34,53,25,50};

        reverse(numbers);

        System.out.println("reverse array:");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }
}
