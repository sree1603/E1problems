
import java.util.*;
public class operators{
	public static void main(String args[]) {
		int a;
		int b;
		
		Scanner leela=new Scanner(System.in);
		System.out.println("enter the numbers");
		a=leela.nextInt();
		b=leela.nextInt();
		int mul=a*b;
		int div=a/b;
		int rem=a%b;
		int sum=a+b;
		int sub=a-b;
		int pow=a*b;
		System.out.println("sum="+sum);
		System.out.println("mul="+mul);
		System.out.println("div="+div);
		System.out.println("sub="+sub);
		System.out.println("pow"+pow);
		System.out.println("rem"+rem);
		leela.close();
		
	}
}	

