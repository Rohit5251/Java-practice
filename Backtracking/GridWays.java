import java.util.*;
public class GridWays {

    public static int GW(int i,int j,int n,int m){
        //Base case
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }
        //recusion
        int w1=GW(i+1, j, n, m);
        int w2=GW(i, j+1, n, m);
        return w1+w2;
    }

    public static void main(String args[]){
        int n=3;
        int m=3;

        System.out.println(GW(0, 0, n, m));
    }
}
