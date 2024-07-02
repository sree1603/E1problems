import java.util.*;
public class Nequalparts{
    public static void main(String args[]){
        int n,l;
        String Example;
        Scanner s=new Scanner(System.in);
        System.out.printf("enter a string : ");
        Example=s.nextLine();
        System.out.printf("enter how many eqal parts required : ");
        n=s.nextInt();
        l=Example.length();
        if(l%n==0){
            int count=0;
            for(int i=0; i<l; i++){
                System.out.print(Example.charAt(i));
                count++;
                if(count==(l/n)){
                    System.out.printf("\n");
                    count=0;
                }
            }
        }
        else{
            System.out.println("can't divide the given string into equal parts");
        }
        s.close();
    }
}