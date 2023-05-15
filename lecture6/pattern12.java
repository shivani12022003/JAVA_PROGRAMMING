//package lecture6;
/*
    1
   2 2 
  3 3 3 
 4 4 4 4
5 5 5 5 5
*/
//same pattern in lec5 pattern11
import java.util.Scanner;
 
public class pattern12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            } 
            // numbers      
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            } 
            System.out.println();
        }
    }
    
}
