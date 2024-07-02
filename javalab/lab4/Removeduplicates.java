import java.util.*;
public class Removeduplicates{
    public static void main(String[] args)
        {
            String Example1, Example2,Example3="";
        Scanner s=new Scanner(System.in);
        System.out.printf("enter string1: ");
        Example1=s.nextLine();
        System.out.printf("enter string2: ");
        Example2=s.nextLine();
        int l=Example1.length();
        for(int i=0; i<l; i++){
            String sub=Character.toString(Example1.charAt(i));
            if(Example2.contains(sub)){
                continue;
            }
            else{
                 Example3+=sub;
            }
        }
            System.out.println("string1 without duplicate characters of string2 is : "+Example3);
        s.close();
}
}