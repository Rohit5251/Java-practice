public class NQueen_isPossible {
    public static boolean nQueen(char bord[][],int row){

        //Base Case
        if(row==bord.length){
            return true;
        }

        //recursion
        for(int j=0;j<bord.length;j++){
            if(isSafe(bord,row,j)){
                bord[row][j]='Q';
                if(nQueen(bord, row+1)){
                    return true;
                }
                bord[row][j]='x';//backtracking
            }
        }
        return false;
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
        int n=4;
        char bord[][]=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                bord[i][j]='x';
            }
        }

        if(nQueen(bord,0)){
            System.out.println("Solution is possible");
            printBord(bord);
        }
        else{
            System.out.println("No soultion");
        }
    }
}
