//package lecture 19;
//qusetion : place the tiles of (1xm) in a floor of size (nxm)
import java.util.Scanner;

public class rec_placetiles {
    public static int placeTiles(int n, int m){
/* {---- BASE CASES -----} 
   1.n=m:
there will be only 2 ways to place the tiles i.e horizontally & vertically
   2.n<m:
there will be  only 1 way to place the tiles i.e horizontally  
*/
    if(n==m){
        return 2;
    }
    if(n<m){
        return 1;
    }
    // vertically 
    int vertplacements=placeTiles(n-m, m);
    // horizontally 
    int horizonplacements=placeTiles(n-1, m);
    return vertplacements+ horizonplacements;
    }
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(placeTiles(n, m));
    }
    
}
