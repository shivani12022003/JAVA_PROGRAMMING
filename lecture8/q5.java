//package lecture8;

import java.util.Scanner;

public class q5 {
    public static void vote(int n){
        if(n<18){
            System.out.println("You can't vote");
        }else{
           System.out.println("You can vote"); 
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        vote(n);
    }
}
