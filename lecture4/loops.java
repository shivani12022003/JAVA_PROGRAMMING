//package lecture4;
import java.util.*;

public class loops {
    public static void main(String args[]) {
        /*******************
         * print 5 times
         System.out.println("Hello");
         System.out.println("Hello");
         System.out.println("Hello");
         .......
         *****************/
        Scanner sc= new Scanner(System.in);
        //for loop
        for(int i=0; i<5; i++){
            System.out.println("HELLO");
        }
        //while loop
        int i=0;
        while(i<5){
            System.out.println("hi");
            i++;
        }
        //do while 
        do{
            System.out.println("YO");
            i++;
        }while(i<5);
    }
}
