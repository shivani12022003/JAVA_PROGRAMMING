package lecture6;
import java.util.*;

//butterfly pattern

public class trial {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //upper half
        for(int i=1; i<=n; i++){
            //first part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            int space=2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            //second part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i=n; i>=1; i--){
            //first part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            int space=2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            //second part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

