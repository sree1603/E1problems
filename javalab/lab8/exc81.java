import java.io.*;
public class exc81 {
    public static void main(String args[]) throws Exception{
        FileWriter f=new FileWriter("buf.txt");
        BufferedWriter bw=new BufferedWriter(f);
        bw.write(100);
        bw.newLine();
        bw.write("12345654",1,1);
        bw.flush();
        bw.close();
        BufferedReader br=new BufferedReader(new FileReader("buf.txt"));
        String s=br.readLine();
        while(s!=null){
            System.out.println(s);
            s=br.readLine();
        }
        br.close();
      
    }
}
