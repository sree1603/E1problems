import java.util.*;
public class Firstnonrepeatchar{
    char search(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
             count=0;
            for(int j=0;j<s.length();j++){
                if(i==j)
                continue;
                else{
                    if(s.charAt(i)==s.charAt(j)){
                    count++;
                    break;
                }
                }
            }
            if(count==0){
                // System.out.printf("the first non repeating character is %c: ", s.charAt(i));
                // break;
            return s.charAt(i);
            }
        }
        // if(count!=0){
        //     System.out.print("No  repeating character found");
        // }
       return 'n';
        
    }
        
    
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.printf("enter a string : ");
         String input=scan.nextLine();
         Firstnonrepeatchar o=new Firstnonrepeatchar();
         //o.search(input);
         char c=o.search(input);
        // System.out.print(c);
        if(c=='n'){
            System.out.print("No  repeating character found");
        }
        else{
            System.out.printf("the first non repeating character is : %c ",c);

        }
        scan.close();
    }
}