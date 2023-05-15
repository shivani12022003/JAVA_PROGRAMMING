package lecture17;

import java.util.Scanner;

public class rec_printnum {
// print num in reverse order in recursion
    public static void print_rev(int n){
        // base case
        if(n==0){
            return;
        }
        System.out.println(n);
        print_rev(n-1);
    }
// print num in inc order in recursion
    public static void print_num(int n){
        if (n==6){
            return ;
        }
        System.out.println(n);
        print_num(n+1);
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int x=1;
    print_num(x);
  
    print_rev(n);
    }
    
}
