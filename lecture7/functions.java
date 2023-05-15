//package lecture7;

import java.util.Scanner;

public class functions {
    public static void printMyName( String name){
        System.out.println("Name:"+name);
        return ;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printMyName(name);  
    }
}
