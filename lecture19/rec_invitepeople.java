import java.util.Scanner;

public class rec_invitepeople {
    public static int invite(int n){
        if(n<=1){
            return 1;
        }
        //single
        int single=invite(n-1);
        //pairs
       int pair=(n-1)*invite(n-2);
       return pair+single;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         System.out.println(invite(n));
         
    }
    
}
