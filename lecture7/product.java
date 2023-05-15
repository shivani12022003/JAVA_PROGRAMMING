//package lecture7;

import java.util.Scanner;

public class product {
    public static int product(int x, int y){
        return x*y;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("Product="+product(x,y));
    }
}
