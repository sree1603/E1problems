import java.io.File;
import java.io.IOException;
public class Createfile {
    public static void main(String args[]){
        try{
            File f=new File("abc.txt");
            File f1=new File("xyz.txt");
           // File f2=new File("");
        boolean y=f.createNewFile();
        if(y){
            System.out.println("file is created successfully.");
        }
        else{
            System.out.println("file is not created.");
        }
        String name=f.getName();
        System.out.println("file is readable: "+f.canRead());
        System.out.println("file is writable: "+f.canWrite());
        System.out.println(name+" file exists in "+ f.getAbsolutePath()+" : "+f.exists());
        System.out.println(f.list());

        System.out.println("length of the file in bytes: "+f.length());
        System.out.println("no of unallocated bytes in above file : "+ f.getFreeSpace());
        f.setReadOnly();
        System.out.println("after using setReadOnly() method.");
        System.out.println("file is writable: "+f.canWrite());
        System.out.println(name+" is a file : "+f.isFile());
        System.out.println(name+" is a directory : "+f.isDirectory());
        if(f.renameTo(f1))
        System.out.println("renamed "+name+" to "+f1.getName());
        else
        System.out.println(name+" is not renamed.");
        if(f1.delete())
        System.out.println("successfully deleted the file : "+f1.getName());
        else
        System.out.println(f1.getName()+"is not deleted.");

    }
    catch(IOException e){
        e.printStackTrace();
    }
    }
}
