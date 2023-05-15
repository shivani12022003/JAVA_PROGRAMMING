import java.util.Scanner;

public class q9 {
    public static int gcd(int x, int y){
     int common =1;
     for(int i=1; i<x || i<y ; i++){
         if(x%i==0 && y%i==0){
            common*=i;
            x/=i;
            y/=i;
         }
     }
     return common;
    }
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      System.out.println("greatest common divisor :"+gcd(x, y));
      
    }
/* diifferent logic
 while(n1 != n2) { 
           if(n1>n2) {
               n1 = n1 - n2;
           } else {
               n2 = n2 - n1;
           }
       }
       System.out.println("GCD is : "+ n2);
 */    
}
