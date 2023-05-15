package lecture2;

import java.util.Scanner;

public class table {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Table:");
        // using loops ;)
        for(int i=1; i<=10; i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
    
}

