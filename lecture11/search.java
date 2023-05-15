package lecture11;

import java.util.*;
public class search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] matrix=new int[n][m];
        //input
        for(int i=0 ;i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int key=sc.nextInt();
        //output
        System.out.println("Matrix:");
        for(int i=0 ;i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");                 
            }System.out.println();
        }
        for(int i=0 ;i<n; i++){
            for(int j=0; j<m; j++){
              if(matrix[i][j]==key) {//search
                 System.out.print("found at:"+i+","+j);
                }             
            }
            System.out.println();
        }
    }
    
}
