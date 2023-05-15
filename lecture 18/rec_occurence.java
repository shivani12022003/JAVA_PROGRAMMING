import java.util.Scanner;
// time complexity:O(n), where n is string length                                                                
public class rec_occurence {
    /* my code(not complete)
    public static int occurence (String str, char ele){
       int first=0;// not initialized by any index to know the difference
       int last=str.length()-1;
       if(str.length()==0){
        System.out.println("Not found");
        return -1;
       } 
    while(first<=last){
        if(str.charAt(first)==ele){
        return first;
    }
    if(str.charAt(last)==ele){
        last--;
        return last;
    }   
    }return -1;
    }
*/
// another approach
public static int first=-1;
public static int last=-1;
    public static void occurence(String str, char element , int idx){      
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
           return;
        }
      char curr=str.charAt(idx);
        if(curr==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        occurence(str, element, idx+1);
     }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();  
        System.out.println("Enter element to be found");
        char ele=sc.next().charAt(0);
        occurence(str,ele, 0);
        System.out.println();
    }
}
/********************
 
 */