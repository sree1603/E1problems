
import java.util.*;
public class rev{
    public static void main(String args[]){
        int num,rem,newnum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a three digit num ");
        num=s.nextInt();
        for(int i=0;i<3;i++){
            rem=num%10;
            newnum=(newnum*10)+rem;
            num=num/10;

        }
        System.out.println("reverse is "+newnum);
        s.close();
    }
}