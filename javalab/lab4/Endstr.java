import java.util.*;
public class Endstr{
   public static void main(String args[]){
        String str1,str2;
        Scanner s=new Scanner(System.in);
        System.out.printf("enter a string : ");
        str1=s.nextLine();
        System.out.printf("enter a string to check whether %s ends with it : ",str1);
        str2=s.nextLine(); 
        if(str1.endsWith(str2))
        System.out.printf("%s ends with %s \n",str1,str2);
        else
        System.out.printf("%s contains %s \n",str1,str2);
         s.close();
   }
}