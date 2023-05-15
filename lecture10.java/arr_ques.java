//package lecture10.java;

import java.util.Scanner;

public class arr_ques {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter elemnet to be searched");
        int x=sc.nextInt();
        for(int i=0 ;i<n; i++){
           arr[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0 ;i<n; i++){
            if(arr[i]==x){
            System.out.println(i);
        }
        }
    } 
}
