package lecture6;
// wanted a butterfly but created smthing else :)
import java.util.Scanner;

public class pattern14 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // upper half
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            // first half
            int end=(2*i)-1;
            for(int j=1; j<=end; j++){
                System.out.print("*");
            }
            // second half 
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
         // lower half
         for(int i=n; i>=1; i--){
            // spaces
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            // first half
            int end=(2*i)-1;
            for(int j=1; j<=end; j++){
                System.out.print("*");
            }
            // second half 
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
     }
    
}
/***************another pattern************* 
//package lecture6;

import java.util.Scanner;

public class pattern14 {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // upper half
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            // first half
            int end=(2*i)-1;
            for(int j=1; j<=end; j++){
                System.out.print("*");
            }
            // second half 
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
         // lower half
         for(int i=n; i>=1; i--){
            // spaces
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            // first half
            int end=(2*i)-1;
            for(int j=1; j<=end; j++){
                System.out.print("*");
            }
            // second half 
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
     }
    
}
********************************************************/