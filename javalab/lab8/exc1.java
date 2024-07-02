import java.util.*;
class oddexception extends Exception {
    public oddexception(String s){
        super(s);
    }
}
public class exc1 {
    int x;
    public void num(){
            System.out.print("enter a even integer : ");
            Scanner obj=new Scanner(System.in);
            x=obj.nextInt();
            try{
                if(x%2!=0){
                    throw new oddexception("you entered the even number.");
                }

            }
            catch(oddexception e){
                System.out.println(e.getMessage());

            }
        }
    public static void main(String args[]){
        exc1 n=new exc1();
        n.num();
        

    }
}