import java.util.*;
public class exc4 {
    public static void main(String args[]){
        int x;
        int flag=0;
        System.out.print("enter the length of the integers");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        int arr[]=new int[x];
        for(int k=0;k<x;k++){
            arr[k]=sc.nextInt();
        }
        String s="";
        for(int i=0;i<x;i++){
            
            try{
                String p=String.valueOf(arr[i]);
                if(s.contains(p)){
                    flag=1;
                    throw new IllegalArgumentException();
                }
                else{
                    s=s+p;
                }
            }
            catch(IllegalArgumentException l){
                System.out.println("duplicate found:"+arr[i]);
            }
        }
        if(flag==0){
            System.out.println("no duplicates found");
        }
    }
}