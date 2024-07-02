import java.util.*;
class Check{
    void Checknum(long num){
        long rem,r;
        long sq;
        rem=num%10;
        sq=(num*num);
        r=sq%10;
        if(rem==r){
            System.out.println("Automorphic number.");
        }
        else{
            System.out.println("Not a Automorphic number.");
        }
    }
}
public class Automorphic {
    public static void main(String[] args){
        long N;
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number : ");
        N=s.nextLong();
        Check o=new Check();
        o.Checknum(N);
        s.close();

    }
}
