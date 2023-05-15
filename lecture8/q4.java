//package lecture8;

import java.util.*;

public class q4 {
    public static double circumference(Double r){
        double pi=3.14;
        return 2*pi*r;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Double r=sc.nextDouble();
        System.out.println("Circumference:"+circumference(r));
    }
    
}
