package lecture8;

import java.util.Scanner;

public class q1 {
    public static float average(int a, int b, int c){
        return (a+b+c)/3;
    } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
        System.out.println("Average="+average(a,b,c));
        }
    }
    
