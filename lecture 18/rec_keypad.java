import java.util.Scanner;
//--------{ USE OF HASHSET }------------
public class rec_keypad {
    public static String [] keypad= {".", "abc","def", "ghi", "jkl", "mno","pqrs" ,"tuv", "wxyz"};
    public static void comb(String str, int idx, String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return ;
        }
        char curr=str.charAt(idx);
        String mapping=keypad[curr-'0'];
        for(int i=0; i<mapping.length(); i++){
           comb(str,idx+1,combination+mapping.charAt(i)); 
        }
        
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        comb(str, 0, "");
    }
    
}
