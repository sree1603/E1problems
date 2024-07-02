import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        String s1,s2="";
        Scanner s=new Scanner(System.in);
        System.out.print("enter a string : ");
        s1=s.next();
        int l=s1.length();
        for(int i=l-1; i>=0; i--){
            s2+=s1.charAt(i);
        }
        if(s1.equals(s2))
        System.out.println(s1+" is a palindrome");
        else
        System.out.println(s1+" is not a palindrome");
        s.close();
    }
}