import java.util.Scanner;

public class rec_reverse {
    /************alternative approach(only one arguement)*********
     public static String reverse(String str){
        if(str.length() == 1){// base case
            return str;
        }
            char curr=str.charAt(0);
            String next=reverse(str.substring(1));

            return next+curr;
        }
     
   */
   public static void reverse(String str, int index){// two arguements
       if( index==0){
           System.out.print(str.charAt(index));
           return ;
       }
       System.out.print(str.charAt(index));
       reverse(str, index-1);
        
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        
       // System.out.println(reverse(str));
        reverse(str, str.length()-1);

    }
}
