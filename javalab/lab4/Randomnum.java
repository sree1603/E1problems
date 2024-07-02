import java.util.*;
public class Randomnum{
    public static void main(String[] args)
    {
        int min,max;
        Scanner s=new Scanner(System.in);
        System.out.print("enter min value of a range : ");
        min=s.nextInt();
        System.out.print("enter max value of a range : ");
        max=s.nextInt();
        Random r=new Random();
        int value=(r.nextInt(max-min))+min;
        System.out.println("random integer in the range "+min+"-"+max+" is : "+value);
        s.close();
    }
}
