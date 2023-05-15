import java.util.Scanner;
// doubt :line 23
public class rec_removedup {
    public static boolean[] map= new boolean[26];
    public static void remove_duplicates(String str, int idx, String result){
        char curr=str.charAt(idx);
        if(idx==str.length()){
            System.out.println(result);
            return;
        }
        if(map[curr-'a']){
            remove_duplicates(str, idx+1,result);
        }else{
            result +=curr;
            map[curr-'a']=true;
            remove_duplicates(str, idx+1,result);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter a string:");
       // String str=sc.nextLine();
       String str="aavvdgdhd";//StringIndexOutOfBoundsException
        remove_duplicates(str, 0,"");
    }
}
