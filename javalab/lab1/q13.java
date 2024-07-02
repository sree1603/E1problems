import java.util.Scanner;
public class q13{
    public static void main(String []args){
        int a,b,c;
            Scanner s=new Scanner(System.in);
            System.out.print("enter 1st num ");
            a=s.nextInt();
            System.out.print("enter 2nd num ");
            b=s.nextInt();
            System.out.print("enter 3rd num ");
            c=s.nextInt();
            if(a==b&&b==c)
            System.out.println("all three numbers are equal ");
            else if(a==b||b==c||c==a)
            System.out.println("only two numbers are equal ");
            else
            System.out.print("all three numbers are unequal ");
            s.close();
    }
}