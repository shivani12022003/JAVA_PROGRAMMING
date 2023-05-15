//package lecture8;

import java.util.Scanner;

public class q7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int zeroes=0;
        int positive=0 ;
        int negative=0;
        int i=0;
        do{           
           i= sc.nextInt();
           i++;
           if(i>0){
            positive++;
           }else if(i<0){
            negative++;
           }else{// zero is not increasing
            zeroes++;
           }
           System.out.println("Pos:"+positive +"neg:"+negative+ "zer:"+zeroes);
        }while(i!=Integer.MAX_VALUE);
    }
    /*
     public static void main(String args[]) {
       int positive = 0, negative = 0, zeros = 0;
       System.out.println("Press 1 to continue & 0 to stop");
       Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();
 
       while(input == 1) {
           System.out.println("Enter your number : ");
           int number = sc.nextInt();
           if(number > 0) {
               positive++;
           } else if(number < 0) {
               negative++;
           } else {
               zeros++;
           }
 
           System.out.println("Press 1 to continue & 0 to stop");
           input = sc.nextInt();
       }
 
       System.out.println("Positives : "+ positive);
       System.out.println("Negatives : "+ negative);
       System.out.println("Zeros : "+ zeros);
   }   
     */
}
