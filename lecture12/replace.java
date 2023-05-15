import java.util.*;

public class replace {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input[]=sc.nextLine();
        String result="";
        for(int i=0; i<=input.length(); i++){
            if(input.charAt(i)=='e'){
                result+='i';
            }else{
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
    }
    
}
