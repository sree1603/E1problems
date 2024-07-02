import java.util.*;
public class duck {
    public static void main(String[] args){
        int num,flag=1;
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number : ");
        num=s.nextInt();
        s.close();
        String N=Integer.toString(num);
        if(N.charAt(0)!='0'){
            for(int i=1; i<N.length(); i++){
                if(N.charAt(i)=='0'){
                    System.out.println("Duck number");
                    break;
                }
                else{
                    flag++;
                }
            }
            //System.out.println(flag);
            if(flag==N.length())
            {
                System.out.println("not a Duck number");
            }
        }
        else
        System.out.println("not a Duck number");
    }
}
