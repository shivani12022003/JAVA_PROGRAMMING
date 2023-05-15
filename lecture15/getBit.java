//package lecture15;
// get bit(what bit is present on given position)

/* new no.= left shift 1 in the original no. by x :
* perform AND operation of new no. with original
* if ans=0(bit =0) : if ans=non zero(bit=1)
IN SHORT:
1. Bit Mask:1<<pos
2. Operation: AND
*/
import java.util.Scanner;
public class getBit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        
        int BM=1<<pos;// BitMask
        if((BM & n)==0){
            System.out.println("Bit was 0");
        }else{
            System.out.println("Bit was 1");
        }
    }
}
