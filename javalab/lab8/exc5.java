import java.util.*;
class NovowelsException extends Exception {
    NovowelsException(String s){
        super(s); 
    }
}
public class exc5 {
    public static void main(String args[]){
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a String;");
        s=sc.next();
        s=s.toLowerCase();
        int flag=0;
        if(s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u")){
            flag=1;
        }
        else{
            try{
                throw new NovowelsException("Novowels are present in the String");
            }
            catch (NovowelsException k){
                System.out.println(k.toString());
            }
        }
        if(flag==1){
            System.out.println("No exception found.");
        }
            
        
    }
}