import java.util.*;
public class Maxlpalindrame{
    public static void main(String args[]){
      String str;
      int z=0;
      int count=0;
      String st_arr[]=new String[100];
        Scanner s=new Scanner(System.in);
        System.out.printf("enter a string : ");
        str=s.nextLine();  
        char char_arr[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                String st=new String(char_arr,i,j-i);
                StringBuilder sb=new StringBuilder(st);
                sb=sb.reverse();
                if(st.equals(sb.toString())){
                    st_arr[z]=st;
                    z++;
                }
            }
        }
        for(int k=0;k<z;k++){
            if(count<st_arr[k].length()){
                count=st_arr[k].length();
            }
        }
        System.out.printf("the longest palindrome substring in the given string is/are : ");
        for(int l=0;l<z;l++){
            if(count==st_arr[l].length())
                System.out.printf("%s ",st_arr[l]);
        }
        s.close();
    }
}