/* question:(not working )
print all substring but the sequence of the alphabets should be same as in string
eg:for  "abc"
substring: a,ab,abc,ac,b,bc,c,empty string 
eg: for "aaa"
substring: a,a,a,aa,aa,aa,aaa,empty string
 */
import java.util.Scanner;

public class rec_subsequences1 {
    public static void subse(String str, int idx, String newstring){
        char curr=str.charAt(idx);
        if(idx==str.length()){
            System.out.println(newstring);
           System.out.println("empty");
            return ;
        }
        // to be called
        subse(str, idx+1, newstring+curr);
        // not to be called
        subse(str, idx+1, newstring+curr);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println("substrings:");
        subse(str,0,"") ;   
    }
}
