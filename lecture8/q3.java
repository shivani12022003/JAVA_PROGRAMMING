//package lecture8;

import java.util.Scanner;

public class q3 {
    public static int greatest(int a, int b){
        if (a>b){
            return a;
        }else if (b>a){
            return b;
        }else{
            System.out.println("They r equal.");
            return 0;
        }

    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     System.out.println("Greater is:"+greatest(a, b));
    }
}
