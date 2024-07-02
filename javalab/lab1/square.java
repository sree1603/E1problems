import java.util.Scanner;
public class square{
    public static void main(String []args){
        int num;
        double sqnum;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number : ");
        num=s.nextInt();
        sqnum=num*num;
        System.out.print("Square of the given number is : "+sqnum);
        s.close();
    }
} 