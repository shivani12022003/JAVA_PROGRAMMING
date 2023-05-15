import java.util.Scanner;
// doubt 
public class rec_move_x {
    public static void move_x(String str, int idx, String res){
        char curr=str.charAt(idx);
        int count=0;

        if(idx==str.length()){
             for(int i=0; i<count; i++){
                res+='x';
            }
            System.out.println(res);
            return ;
        }
        if(curr=='x'){
            count++;
            move_x(str, idx+1,res);
        }else{
            res+=curr;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=sc.next();
        System.out.println("the ans is:");
       
       /*  for any number:
       int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        */

    }
}
