import java.io.*;
import java.util.*;

public class Solution {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        String ans=ticTacToe(arr,n);
        System.out.println(ans);
    }
    public static String ticTacToe(int[][] arr,int n){
        int d1=0;int d2=0;
        for(int i=0;i<n;i++){
            int row=0,col=0;
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    row++;
                }
                if(arr[j][i]==0){
                    col++;
                }
                if(i==j&&arr[i][j]==0){
                    d1++;
                }
                if(i+j==n-1&&arr[i][j]==0){
                    d2++;
                }
            }
            if(row==0||row==3||col==0||col==3){
                return "Games End";
            }
        }
        if(d1==0||d1==3||d2==0||d2==3){
                return "Games End";
            }
        return "Draw";
    }
}