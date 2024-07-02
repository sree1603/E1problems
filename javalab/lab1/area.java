import java.util.*;
public class area{
    public static void main(String args[]){
        int l,b,area;
        Scanner ss=new Scanner(System.in);
        System.out.println("enter length: ");
        l=ss.nextInt();
        System.out.println("enter breadth: ");
        b=ss.nextInt();
        area=l*b;
        System.out.println("area is "+area);
        ss.close();
         }
}