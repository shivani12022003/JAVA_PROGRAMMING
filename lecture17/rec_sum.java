//package lecture17;

import java.util.Scanner;

public class rec_sum {
    public static int sum(int n){
        int result=n;
        if(n==0){
            return 0;
        }
        result+=sum(n-1);
        
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("sum:"+ sum(n));
    }
}
