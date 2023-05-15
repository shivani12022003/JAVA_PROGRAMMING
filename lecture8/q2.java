package lecture8;

import java.util.Scanner;

public class q2 {
    public static int sumOfOdd(int n){
        int ld,i=1, sum=0;
        if(n%2!=0){
            ld=n;
        }else{
            ld=n-1;
        }
        while(i<=ld){
            sum+=i;
            i+=2;
        }
        return sum;
        /*
         for(int i=1; i<=n; i++) {
        if(i % 2 != 0) {
            sum = sum + i;
        }
         */
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("sum of odd num="+sumOfOdd(n));
    }
    
}
