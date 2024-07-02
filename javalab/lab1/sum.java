import java.util.*;
public class sum{
    public static void main(String args[]){
        int num, sum=0, rem;
        Scanner s=new Scanner(System.in);
        System.out.println("enter any 5 digit number ");
        num=s.nextInt();
        for(int i=0; i<=5; i++){
            rem=num%10;
            if(i==1)
            sum+=rem;
            if(i==4)
            sum+=rem;
            num=num/10;
        }
        System.out.println("sum of 1st and 2nd last digit for given number is "+sum);
        s.close();
    }
}