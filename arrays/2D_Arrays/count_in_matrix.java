import java.util.*;
public class count_in_matrix {

    public static int count(int matrix[][]){
        int n=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==7){
                    n+=1;
                }
            }
        }
        return n;
    }

    public static void main(String args[]){
        int matrix[][]={
            {4,7,8},
            {8,8,7}
        };
        System.out.println(count(matrix));
    }
}
