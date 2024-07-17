import java.util.*;
public class diagonal_sum {

    public static int primaryDiagonalSum(int matrix[][]){
        int primarySum=0;
        int j=0;
        for(int i=0;i<matrix.length;i++){
            primarySum=primarySum+matrix[i][j];
            j++;
        }
        return primarySum;
    }

    public static int secondaryDiagonalSum(int matrix[][]){
        int secondarySum=0;
        int j=matrix.length-1;
        int n=matrix.length;
        if(n%2!=0){
            for(int i=0;i<matrix.length;i++){
                if(i==j){ 
                    j--;
                    continue;
                }
                secondarySum=secondarySum+matrix[i][j];
                j--;
            }
        }else{
            for(int i=0;i<matrix.length;i++){
                secondarySum=secondarySum+matrix[i][j];
                j--;
            }
        }
        
        return secondarySum;
    }
    
    //optimize solution
    public static int optimize(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum=sum+matrix[i][i];

            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }

        }
        return sum;
    }

    public static void main(String args[]){
        int matrix[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int primary=primaryDiagonalSum(matrix);
        // System.out.println(primary);
        // int secondary=secondaryDiagonalSum(matrix);
        // System.out.println(secondary);
        // System.out.println("Sum of Both Diagonal is :"+ (primary+secondary));
        System.out.println(optimize(matrix));
    }
}
