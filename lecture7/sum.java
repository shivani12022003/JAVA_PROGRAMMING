//package lecture7;

import java.util.Scanner;

public class sum {
    public static int sum(int a, int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt(); 
        System.out.println("Sum="+sum(a,b));
    }
}
