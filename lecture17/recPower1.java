//package lecture17

import java.util.Scanner;

public class recPower1 {
// stack height should be =log(n)
    public static int calPower(int x,int n){
       if(n==0){
        return 1;
       }
       if(x==0){
        return 0;
       }
       if(n%2==0){// if n is even
        return calPower(x, n/2)*calPower(x, n/2);
       }else{
         return calPower(x, n/2)*calPower(x, n/2)*x;
       }
       
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a base:");
        int x=sc.nextInt(); 
        System.out.println("Enter the power:");       
        int n=sc.nextInt();        
       System.out.println( calPower(x, n));

    }
    
}

