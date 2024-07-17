import java.util.*;
public class arrayBasic {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
;       }
    }

    public static int lS(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(key==numbers[i]){
                return i;
            }
           
        }
        return -1;

    }
    public static void main(String args[]){
        int numbers[]={423,522,5,2,52,56,2,56,778,65,76,20};
        int key=52;
        int index=lS(numbers, key);
        System.out.println("keu is at "+ index);

    }
}
