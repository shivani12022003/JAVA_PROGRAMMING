package lecture13;

import java.util.*;
// Strring builder is used to save the time 
public class stringbuild {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb= new StringBuilder("h");
        //append(add at the ending)
        System.out.println(sb);
        sb.append("e");
        System.out.println(sb);
        sb.append("l");
        System.out.println(sb);
        sb.append("l");
        System.out.println(sb);
        sb.append("o");
        System.out.println(sb);
        
        //char at any index
        System.out.println(sb.charAt(1));

        //insert char at any index
        sb.insert(4, 'g');
        System.out.println(sb);
        // length of the string     
        System.out.println("length of string="+sb.length());
        // set char at any index
        sb.setCharAt(3, 's');
        System.out.println(sb);

        //delete char/substring at any index
        sb.delete(3, 4);
        System.out.println(sb);
    }
}
