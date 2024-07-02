import java.io.*;
import java.util.*;
class Empoly {
    String n;
    int id;
    String t;
    Empoly(String n,int id,String t){
        this.n=n;
        this.id=id;
        this.t=t;
    }
    public String leela(){
      return String.format("%s  %d  %s \n",n,id,t);
    }
}
public class exc9 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Empoly[] n=new Empoly[5];
        for(int i=0;i<5;i++){
            System.out.print("enter empolyee name: ");
            String e=s.next();
            System.out.print("enter empolyee Id: ");
            int l=s.nextInt();
            System.out.print("enter empolyee title: ");
            String f=s.next();
            n[i]=new Empoly(e,l,f);
        }
         
        try(FileWriter w = new FileWriter("emply.txt")){
            
            for(int h=0;h<5;h++){
               
                w.write(n[h].leela());
               
            }
           
           
        }
        catch(IOException e){
            System.out.println("an error is occured");
            e.printStackTrace();
        }
        try(BufferedReader ne=new BufferedReader(new FileReader("emply.txt"))){
            String h;
            while((h=ne.readLine())!=null){
                System.out.println(h);
            }
        }
        catch(IOException e){
            System.out.println("an error occured");

        }
        catch(Exception d){
            System.out.println("exception occured");
        }
        

    }

}