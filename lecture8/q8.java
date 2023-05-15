//package lecture8;

import java.util.Scanner;

public class q8 {
    public static int powerofx(int x, int n){
       if(n==0){
        return 1;
       }
       int ans=1;
       for(int i=1; i<=n; i++){
        ans*=x;
       }
      return ans;   
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int n=sc.nextInt();
      System.out.println("ans:"+powerofx(x, n));   
    }
/*
 System.out.println("Enter x");
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       System.out.println("Enter n");
       int n = sc.nextInt();
       int result = 1;
       for(int i=0; i<n; i++) {
           result = result * x;
       } 
       System.out.println("x to the power n is : "+ result);
   }   

 */
}
