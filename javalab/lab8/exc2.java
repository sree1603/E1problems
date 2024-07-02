import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class exc2 {
    public void main(File x){
        
        try{
        Scanner read=new Scanner(x);
        while(read.hasNextLine()){
            String data=read.nextLine();
            System.out.println(data);
        }
        read.close();
    }
    catch(FileNotFoundException e){
        System.out.print("file not found");
    }
    }
    public static void main(String args[]){
        File f=new File("abcd.txt");
        exc2 b=new exc2();
        b.main(f);
       
    }
}
