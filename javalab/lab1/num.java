import java.util.*;
public class num{
    public static void main(String args[]){
        int given,rem=0,rev=0,pass=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a 4 digit given ");
        given=s.nextInt();
        for(int i=0;i<4;i++){
            rem=given%10;
            rem=rem+2;
            if(rem>9)
            rem%=10;
            rev=(rev*10)+rem;
            given=given/10;

        }
        for(int i=0;i<4;i++){
                rem=rev%10;
                pass=(pass*10)+rem;
                rev=rev/10;
        }
        System.out.println("required given is "+ pass);
        s.close();
    }
}