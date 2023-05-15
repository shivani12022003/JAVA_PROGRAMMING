import java.util.Scanner;

import javax.naming.NamingException;
//Set Bit
/*
STEPS:
1. Bit Mask: 1<<pos
2. Operation: OR
 */
public class setBit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();

        int BM= (1<<pos) ;
        int res=(BM | n);
        System.out.println(res);
    }
}
