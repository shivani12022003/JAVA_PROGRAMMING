//package lecture16;
// Time Complexity=O(n^2)
import java.util.*;

public class bubblesort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        //input of array
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
           for(int j=0; j<n-i-1; j++){ 
                if(arr[j]>arr[j+1]){
                   // swap
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
        //output of sorted array
        for(int i=0; i<n;i++){
            System.out.print(arr[i]);
        }
    }    
}
