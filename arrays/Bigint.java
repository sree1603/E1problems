package arrays;//remove package while running
import java.math.BigInteger;
public class Bigint{
    public static void main(String args[]){
        int a=5;
        BigInteger A=new BigInteger("1");
        //BigInteger C=BigInteger.ONE;
        //BigInteger B=BigInteger.valueOf(a);
        for(int i=2;i<=a;i++){
            A=A.multiply(BigInteger.valueOf(i));
        }
        System.out.println(A);
    }
}