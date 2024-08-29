import java.util.*;
public class NQueens_AllWays {

    public static void nQueen(char bord[][],int row){

        //Base Case
        if(row==bord.length){
            printBord(bord);
            count++;
            return;
        }

        //recursion
        for(int j=0;j<bord.length;j++){
            if(isSafe(bord,row,j)){
                bord[row][j]='Q';
                nQueen(bord, row+1);
                bord[row][j]='x';//backtracking
            }
           
        }
    }

    public static boolean isSafe(char bord[][],int row,int col){
        //vartical up
        for(int i=row-1;i>=0;i--){
            if(bord[i][col]=='Q'){
                return false;
            }
        }

        //dig left
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(bord[i][j]=='Q'){
                return false;
            }
        }

        //dig right
        for(int i=row-1 , j=col+1; i>=0 && j<bord.length;i--,j++){
            if(bord[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static void printBord(char bord[][]){
        System.out.println("------Chess Bord------");
        for(int i=0;i<bord.length;i++){
            for(int j=0;j<bord.length;j++){
                System.out.print(bord[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static int count=0;
    public static void main(String args[]){
        int n=5;
        char bord[][]=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                bord[i][j]='x';
            }
        }

        nQueen(bord,0);
        System.out.println("Total Number of ways :"+ count);
    }
}
