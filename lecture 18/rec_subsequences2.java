/* question:(not working)
print all substring but the sequence of the alphabets should be same as in string
(this will be wothout repeatition eg:aaa
substrings: a, aa, aaa) 
eg:for  "abc"
substring: a,ab,abc,ac,b,bc,c,empty string 

------{ USE OF HASHSET }--------
 */
import java.util.HashSet;
import java.util.Scanner;

public class rec_subsequences2 {
    public static void subse(String str, int idx, String newstring, HashSet<String> set){
        char curr=str.charAt(idx);
        if(idx==str.length()){
            if(set.contains(newstring)){
                return;
            }else{
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }
        // to be called 
        subse(str, idx+1, newstring+curr,set);
        // not to be called
        subse(str, idx+1, newstring+curr,set);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashSet<String> set=new HashSet<>();
        System.out.println("Enter a string:");
        String str=sc.next();
        System.out.println("substrings:");
        subse(str,0,"",set) ;   
    }
}

