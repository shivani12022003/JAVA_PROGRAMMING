//package lecture17;

import java.util.Scanner;

public class rec_factorial {
    public static int printFact(int n){
        if(n==0){
            return 1;
        }
        int fact=n;
         fact*=printFact(n-1);
         return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
       System.out.println("factorial:" + printFact(n));
    }    
}
