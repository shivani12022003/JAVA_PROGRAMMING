// UPDATE BIT 
/* STEPS:
1. Bit Mask: 1<<pos
2. Operation:
 if 1{BM | N}
 if 0{n & ~(BM)}
 */
import java.util.Scanner;

public class updateBit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        System.out.println("Enter 1 or 0");
        int update=sc.nextInt();

        int BM=1<<pos;
        int res;
        if(update==1){
            System.out.println((n | BM));
        }else if(update==0){
            System.out.println(n & (~BM));
        }else{
            System.out.println("Not Valid");
        }
    }
}
