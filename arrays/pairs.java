import java.util.*;
public class pairs {
    public static void p(int numbers[]){

        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+ curr + " , " + numbers[j]+") ");
                
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int numbers[]={3,4,53,24,55,200};

        p(numbers);
        
    }
}
