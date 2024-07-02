import java.util.*;
public class Palinusingrecur{
    boolean PalindromeChecker(String s){
        if(s.length()<=1)
            return true;
        int fn=s.charAt(0);
        int ln=s.charAt(s.length()-1);
        if(fn!=ln)
            return false;
        return PalindromeChecker(s.substring(1,s.length()-1));
    }
    public static void main(String[] args){
        String str;
        Palinusingrecur p=new Palinusingrecur();
        Scanner o=new Scanner(System.in);
        System.out.print("enter a string : ");
        str=o.next();
        boolean val=p.PalindromeChecker(str);
        if(val)
            System.out.println(str+" is a palindrome.");
        else
            System.out.println(str+" is not a palindrome.");
            o.close();
    }
    
}