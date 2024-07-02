import java.util.*;
public  class Longestsubstring{
     Longestsubstring(String s){
        String sub="";
        int i=0,j=0;
        int m=0,n=0,len=0,max=0;
        int k=0;
        String[] stri=new String[100];
        while(i<s.length()){
            for(j=i+1;j<s.length()+1;j++){
                 String end;
                if(j==s.length())
                    end=s.substring(j-1,j);
                else
                    end=s.substring(j,j+1);
                sub=s.substring(i,j);
               
                
                if(sub.contains(end))
                break;
                }
                len=sub.length();
              //  System.out.println(sub);
                 if(len>=max){
                m=i;
                n=j;
                max=len;
                stri[k]=s.substring(m,n);
                k++;
                }
                i++;               
                }  
         System.out.printf("the longest substring without repeating characters is/are:");        
        for(int p=0;p<k;p++)  {
                if(stri[p].length()==max)           
                        System.out.printf(" %s,",stri[p]);
        }
        System.out.printf(" \n its length is %d",max);
     }
     
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.printf("enter a string : ");
        // String input=scan.nextLine();
        //Longestsubstring o=new Longestsubstring(input);
        scan.close();
}
}

