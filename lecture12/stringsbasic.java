//package lecture12;

import java.util.*;

public class stringsbasic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //input
        String str1=sc.next();//only one word
        String str2=sc.nextLine();//whole sen
        System.out.println(str1);
        System.out.println(str2);
        // declaration
        String fName="Tony";
        String lName="Stark";       
        // concatenation
        System.out.println(fName+lName);
        //length
        System.out.println(fName.length()+" "+ lName.length());
        String fullName=fName+lName;
        // access char of a string
        for(int i=0; i<fullName.length(); i++ ){
            System.out.println(fullName.charAt(i));
        }
        /*compare(first char that is dissimilar is compared)
           s1>s2: +ve value (eg:hello>cello)
           s1==s2: 0        (eg:hello==hello)
           s1<s2: -ve value (eg:gghello<ggwello)
        */
        String s1="hello";
        String s2="hell";
        if(s1.compareTo(s2)==0){
           System.out.println("Strings are equal "+s1.compareTo(s2));
        }else{
            System.out.println("Strings are not equal "+s1.compareTo(s2));
        }
        System.out.println("tony and stark compared:"+fName.compareTo(lName));
        //do not directly compare by (==)
        System.out.println("ans:" +new String("abc")==new String("abc")); 
        if(s1==s2){// some test cases can fail for this
            System.out.println("Strings are equal");
         }else{
             System.out.println("Strings are not equal");
         }
    // substring
    String sentence ="My name is Shivani";
   // substring (begin index, end index);
   String sub= sentence.substring(5,15);
   System.out.println(sub);
   
    }
    
}
//ALWAYS REMEMBER: Java strings are immutable
 