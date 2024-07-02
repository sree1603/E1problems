import java.util.Scanner;
public class fieldofint{
    public static void main(String []args){
        int rollnum;
        String name, field;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your name : ");
        name=s.next();
        System.out.print("Enter your rollnum : ");
        rollnum=s.nextInt();
        System.out.print("Enter your field of interest : ");
        field=s.next();
        System.out.println("Hey, my name is "+name+ " and my roll number is "+rollnum+". My field of interest is "+field);
        s.close();
    }
}