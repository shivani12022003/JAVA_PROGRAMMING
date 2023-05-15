import java.util.ArrayList;
import java.util.Scanner;
/*time complexity :
as every number has two choices i.e to be present or not
i.e n elelments have two choices each hence,
=> T(n)=O(2^n)
eg :        n=3  
       /           \
      3             .
    /   \         /    \
  32     3       2      ..
 /  \   /  \    / \     / \
321 32  31  3. 21  2.  1  ...
=>321 32 31 3 21 2 1 .(8 subsets)
 */
public class rec_printsubsets {
    public static void printsubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }System.out.println();
    }

    public static void subsets(int n, ArrayList<Integer> subset ){
        if(n==0){ 
            printsubset(subset);
            return ;
        }
        // add subset
        subset.add(n);
        subsets(n-1,subset);
        //subset is not added
        subset.remove(subset.size()-1);
        subsets(n-1, subset);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();
        subsets(n,subset);
    }
    
}
