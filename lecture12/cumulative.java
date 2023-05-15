import java.util.*;

public class cumulative {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String array[]=new String[n];
        int length=0;

        for (int i=0 ;i<n; i++){
            array[i]=sc.next();
            length+=array[i].length();
        }
        System.out.println(length);
    }
}
