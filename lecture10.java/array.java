//package lecture10.java;

import java.util.*;
public class array {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int numbers[]= new int [size];
      //input
      for(int i=0; i<size; i++){
        numbers[i]=sc.nextInt();
      }
      //output
      System.out.println("output");
      for(int i=0; i<size; i++){
       System.out.println(+numbers[i]);
      }
    }
    
}