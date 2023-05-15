package lecture20;

import java.util.Scanner;

public class bt_permutations {
    public static void printPermutation(String str, String perm, int idx){
        if(str.length()==0){
            System.out.println(perm);
            return ;
        }
        for(int i=0; i<str.length(); i++){
            char currChar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            printPermutation(newstr, perm+currChar, idx+1);
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        printPermutation(str, "", 0);
    }
}
