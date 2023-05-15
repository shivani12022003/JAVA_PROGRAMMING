package lecture19;
/*time complexity :
n*(n-1)*(n-2)------------2*1
=>n!
T(n)=O(n!)
 */
import java.util.Scanner;

public class permutations {
    public static void printperm(String str, String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);

            printperm(newstr, result+curr);
        }
        
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a string:");
       String str=sc.nextLine();
       System.out.println("substrings:");
       printperm(str, "");
    }
}
