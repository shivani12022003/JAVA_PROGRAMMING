// CLEAR BIT
/* STEPS:
1. Bit Mask: 1<<pos
2. Operation: AND with NOT
 */
import java.util.Scanner;

public class clearBit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();

        int BM=1<<pos;
        int res=(n & ~(BM)); 
        System.out.println(res);
    }
}
