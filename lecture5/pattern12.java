import java.util.Scanner;
/*PALINDROMIC PATTERN
    1
   212
  32123
 4321234
543212345
 
 */
//same as lec6 pattern13
public class pattern12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //reverse no.
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //inc no. from 2
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    
}
