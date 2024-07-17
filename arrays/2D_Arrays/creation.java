/**
 * creation
 */
import java.util.*;
public class creation {

    public static void printArray(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void search(int matrix[][],int key){
        boolean found=false;
        int n=Integer.MAX_VALUE,m=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    n=i;
                    m=j;
                    found=true;
                    break;
                }
            }
        }
        if(found==true){
            System.out.println("key found at index ("+n +","+m +")" );
        }
        else{
            System.out.println("key not found");
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Enter the element at ("+i +" ,"+j+"):");
                matrix[i][j]=sc.nextInt();
            }
        }

        printArray(matrix);
        search(matrix, 7);
    }
}