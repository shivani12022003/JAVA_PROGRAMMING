import java.util.Scanner;

public class checksort {
    // if array is increasing
    public static boolean check(int array[], int idx){
        int n=array.length;
        if(idx==n-1){
            return true;
        } 
        if(array[idx]<array[idx+1]){
            
            return check(array,idx+1);
        }else{
            return false;
        }
           
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0; i<n; i++){
            array[i]=sc.nextInt();
        }
        System.out.println(check(array,0));
        
    }
}
