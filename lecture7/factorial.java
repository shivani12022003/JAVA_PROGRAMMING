import java.util.*;

public class factorial {
    public static void factorial(int n){
        int fact=1;
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        if(n==0 || n==1){
            System.out.println("1");;
        }
        for(int i=1; i<=n; i++){
            fact*=i;
        }
      // int fact=factorial(n-1);
       // return n*fact;
       System.out.println(fact); 
       return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);

        /*
        cant write '+' funct in syso as retruntype of the function is void
        System.out.println("Factorial:"+ factorial(n)); 
        */
    }    
}
