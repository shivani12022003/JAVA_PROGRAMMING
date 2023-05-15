//package lecture17;
// stack height should be =n
import java.util.Scanner;

public class recPower {
    public static int calPower(int x,int n){
       if(n==0){
        return 1;
       }
       if(x==0){
        return 0;
       }

       int ans=x;
       ans*=calPower(x, n-1);
       
       return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a base:");
        int x=sc.nextInt(); 
        System.out.println("Enter the power:");       
        int n=sc.nextInt();        
       System.out.println( calPower(x, n));

    }
    
}
