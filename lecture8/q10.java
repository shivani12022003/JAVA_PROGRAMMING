import java.util.*;
 
public class q10 {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      
       int a = 0, b = 1;
          
       System.out.print(a+" ");
      
       if(n > 1) {
           //find nth term
           for(int i=2; i<=n; i++) {
               System.out.print(b+" ");
               //the concept below is called swapping
               int temp = b;
               b = a + b;
               a = temp;
           } 
           System.out.println();
       } 
   }   
}

/*import java.util.*;

public class q10 {
    public static void Fibonacci(int t1, int t2, int n){
        int next=0;
        // base case
        if(n==0){
            System.out.println("0");
        }
      for(int i=0; i<=n; i++) {
        t1=t2;
        t2=next;
        next=t1+t2;
        System.out.print(t1+" "+t2);
    }

    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int t1=sc.nextInt();
       int t2=sc.nextInt();
       Fibonacci(t1, t2, n);

    }
    
}
*/
