import java.util.*;
public class Containstr{
    public static void main(String args[]){
        String str1,str2;
        Scanner s=new Scanner(System.in);
        System.out.printf("enter a string : ");
        str1=s.nextLine();
        System.out.printf("enter a string to check whether it is in %s : ",str1);
        str2=s.nextLine();
        if(str1.contains(str2))
        System.out.printf("%s contains %s \n",str1,str2);
        else
        System.out.printf("%s doesnot contain %s \n",str1,str2);
        s.close();
    }
}