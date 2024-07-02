import java.util.*;
public class Strseq{
    public static void main(String args[]){
        String str1,str2;
        Scanner s=new Scanner(System.in);
        System.out.printf("enter string 1: ");
        str1=s.nextLine();
        System.out.printf("enter string 2 : ",str1);
        str2=s.nextLine(); 
            if (str1.equals(str2)) {
            System.out.println("The two strings contain the same data.");}
            else
            System.out.printf("%s and %s doesnot contain same data\n",str1,str2);
                s.close();
    }
}