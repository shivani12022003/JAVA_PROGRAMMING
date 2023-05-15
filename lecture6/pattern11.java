package lecture6;
// same pattern in lec5 pattern10 but different soln.
/*  RHOMBUS OF N LINES EACH WITH N STARS

    *****
   *****
  *****
 *****
*****

*/
import java.util.Scanner;

public class pattern11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num:");
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
            System.out.print(" ");
            }
            // stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
