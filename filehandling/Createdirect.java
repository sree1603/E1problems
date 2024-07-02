import java.io.File;
public class Createdirect {
    public static void main(String args[])
    {
        File f=new File("//home//user//CODE//filehandling//flower");
        // f.createNewFile();
        f.mkdir();
        File g=new File("flower//rose");
        g.mkdir();
        File j=new File("flower//rose//red");
        j.mkdir();
        File h=new File("//home//user//CODE//filehandling//flower//color//red");
        h.mkdir();
        //should not create a folder named veggies
        //because there is no color folder exists...
        //in this case mkdir() returns false
        h.mkdirs();
        //if we use mkdirs() it will create new parent folders that doesn't exists also....
        File k=h;
        String[] l=f.list();
        System.out.print("list of files present in "+f.getName()+" are : ");
        for(int i=0;i<l.length;i++){
            System.out.print(l[i]+" ");
        }
        System.out.println("");
        System.out.println(j.equals(h));
        System.out.println(h.equals(k));
        System.out.println(j.getName()+" is a directory : "+j.isDirectory());
        File[] ll=f.listFiles();
        System.out.print("list of files in "+f.getName()+" are : ");
        for(int q=0;q<ll.length;q++){
            System.out.print(ll[q]+" ");
        }
    }
    
}
