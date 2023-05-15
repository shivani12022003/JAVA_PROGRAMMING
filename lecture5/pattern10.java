/*  RHOMBUS OF N LINES EACH WITH N STARS
    *****
   *****
  *****
 *****
*****
*/
// same pattern in lec6 pattern11 but different soln.

import java.util.Scanner;

public class pattern10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=n-i; j<=2*n-i; j++){ 
              System.out.print("*");             
            }
              System.out.println();
               
        }   
    }
}
