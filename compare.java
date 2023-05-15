import java.util.Scanner;

public class compare {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("a=");
       int a= sc.nextInt();
       System.out.print("b=");
       int b= sc.nextInt();
  if(a>b){
        System.out.println("a is greater");
       }else if(a<b){
        System.out.println("b is greater");
       }else{
        System.out.println("They are equal.");
       }
    }
}
/************************
 NESTED IF ELSE CONDN.
  if(a==b){
        System.out.println("They are equal");
       }else {
        if(a>b){
        System.out.println("a is greater");}
       }else{
        System.out.println("b is greater");
       }
    }
}
 */