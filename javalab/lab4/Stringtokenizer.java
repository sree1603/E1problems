import java.util.*;
public class Stringtokenizer{
    public static void main(String[] args){
        String s1,s2;
        Scanner o=new Scanner(System.in);
        System.out.print("enter a string : ");
        s1=o.nextLine();
        System.out.print("enter a delimiter : ");
        s2=o.nextLine();
        StringTokenizer str=new StringTokenizer(s1,s2);
        System.out.println("no of tokens present : "+str.countTokens());
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }
        o.close();
    }
}