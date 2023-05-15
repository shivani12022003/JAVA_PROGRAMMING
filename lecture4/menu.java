import java.util.*;

public class menu {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 0 or 1");
        int n;
        //int n=sc.nextInt(); as we already take input in loop
        do{
            System.out.println("Enter your marks:");
            int marks=sc.nextInt();
            if(marks >= 90 && marks <= 100){
                System.out.println("This is good");
            }else if (marks >= 60 && marks <= 89) {// errror
                System.out.println("This is also good");
            } else if(marks >= 0 && marks <= 59){
                System.out.println("This is good as well");
            }else{
                System.out.println("Invalid");
            }
        System.out.println("Do you want to continue ? yes(1) no(0)");
        n=sc.nextInt();

        }while(n!=0);

    }
    
}
