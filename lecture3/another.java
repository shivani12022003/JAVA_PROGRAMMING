package lecture3;
import java.util.*;

public class another {
   public static void main(String args[]){ 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a num:");
    int button=sc.nextInt();
    
    switch(button){
        case 1:System.out.println("HELLO");
        break;
        
        case 2:System.out.println("NAMASTE");
        break;

        case 3:System.out.println("BONJOUR");
        break;

        case 4:System.out.println("MERHABA");
        break;

        default:System.out.println("INVALID");
    }
}
}
