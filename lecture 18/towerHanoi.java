import java.util.Scanner;

//package lecture 18

public class towerHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        // if n=1 (base case)
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        // transfer of n-1 disk here form src to helper (dest <-> helper )
        towerOfHanoi(n-1, src, dest , helper);
        // n(last disk in src) tranfer from src to dest
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        // n-1 disk on helper will tranfer from helper to dest (src <-> helper )
        towerOfHanoi(n-1, helper,src ,dest );
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=3;
        towerOfHanoi(n, "S", "H", "D");

    }
    
}
