import java.util.*;

public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                flag=false;   
                break;         
              }
        }
        if(flag){
            if(n==1){
                System.out.println("neither prime nor composite");
               }else{
                System.out.println("Prime");
            }
           }else{
            System.out.println("Not Prime");
        }
    }
}
