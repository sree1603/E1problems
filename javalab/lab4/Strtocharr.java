import java.util.*;
public class Strtocharr{
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    String str;
    System.out.printf("enter a string : ");
    str=s.nextLine();   
    char[] arr;
    arr=str.toCharArray();
    System.out.printf("the given string as char array : ");
    for(int i=0;i<str.length();i++){
        System.out.printf("%c ",arr[i]);
    }
    s.close();
    }
}

