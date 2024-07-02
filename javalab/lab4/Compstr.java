import java.util.*;
public class Compstr{
    public static void main(String args[]){
        String str1,str2,ustr1,ustr2;
        int comp,count=0;
        Scanner s=new Scanner(System.in);
        System.out.print("enter string 1 : ");
        str1=s.nextLine();
        System.out.print("enter string 2 : ");
        str2=s.nextLine();
        System.out.println("length of str1 is "+str1.length());
        System.out.println("length of str2 is "+str2.length());
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
        if(Character.isUpperCase(ch)){
            count++;
            }
        }
        if(count==str1.length())
        System.out.println( str1+ " is already in uppercase ");
        else{
        ustr1=str1.toUpperCase();
        System.out.println(str1+ " in uppercase : "+ustr1);}
        count=0;
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
         if(Character.isUpperCase(ch))
         count++;
        }
        if(count==str2.length())
        System.out.println(str2+ " is already in uppercase ");
        else {      
        ustr2=str2.toUpperCase();
        System.out.println(str2+ " in uppercase : "+ustr2);
        }
        
        comp=str1.compareToIgnoreCase(str2);
        if(comp==0)
        System.out.println("str1 is equal to str2 ");
        else if(comp>0)
        System.out.println("str1 comes before str2 ");
        else
        System.out.println("str1 comes after str2 ");
       System.out.println(str1+ "after trimming : "+str1.trim());
        System.out.println(str2+ "after trimming : "+str2.trim());
        s.close();

    }

}