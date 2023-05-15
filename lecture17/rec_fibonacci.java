//package lecture17;

import java.util.Scanner;

public class rec_fibonacci {
    public static void recFact(int a, int b, int n){
        if(n==0){
            return;
        }
        System.out.print(a+" ");
        recFact(b,a+b, n-1);
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first no.");
    int a=sc.nextInt();// first no. of series
    System.out.println("Enter second no.");
    int b=sc.nextInt();// second no. of series
    System.out.println("Enter total no. to be printed");
    int n=sc.nextInt();// total no. of series
    recFact(a, b, n);
    }
}
