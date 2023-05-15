//package lecture6;

import java.util.Scanner;
/**** BUTTERFLY PATTERN **** 

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

*/
public class pattern10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num:");
        int n=sc.nextInt();
        // for upper half
        for(int i=1; i<=n; i++){
            //for first part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // for space 
            int space =2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            // for second part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for lower half
        for(int i=n; i>=1; i--){
            //for first part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // for space 
            int space =2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            // for second part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
