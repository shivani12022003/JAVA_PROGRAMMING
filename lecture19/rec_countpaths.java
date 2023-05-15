//package lecture 19;
/*RULES:
 i)right 
 ii)downwards
 */
import java.util.Scanner;

public class rec_countpaths {
    public static int countPaths(int n, int m){
        if(n==1 || m==1){
            return 1;
        }
        // downwards
        int down=countPaths(n-1, m);
        // right
        int right=countPaths(n, m-1);
        return down+right;
        /** or directly*****
         return countPaths(n-1, m)+countPaths(n, m-1);
        *******************/
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in); 
         int n=sc.nextInt();
         int m=sc.nextInt();
         System.out.println(countPaths(n, m));
         //System.out.println(countPaths(0,0,n, m));(for backtracking solution)
    }
}
/**********{------ BACKTRACKING -------} ***************
 // time complexity: O(2^(m+n))
      public static int countPaths(int i, int j, int n, int m) {
       if(i == n-1 || j == m-1) {
           return 1;
       }
 
       return countPaths(i+1, j, n, m) + countPaths(i, j+1, n, m);
   }

 ********************************************/