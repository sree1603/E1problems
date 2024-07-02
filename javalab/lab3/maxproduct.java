import java.util.Scanner;

public class maxproduct {
    public static void main(String args[]){
         
        System.out.print("enter the length of  sorted array1:");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int in[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("enter the arr1["+i+"]: ");
            in[i]=obj.nextInt();
        }
        int temp=0;
        for(int i=0;i<n-1;i++){
            for(int l=0;l<n-i-1;l++){
                if(in[l+1]<in[l]){
                    temp=in[l];
                    in[l]=in[l+1];
                    in[l+1]=temp;
                }

            }
        }
        int result=in[n-1]*in[n-2];
      System.out.println("the maximum product of "+in[n-2]+"and"+in[n-1] +"is"+result);
    obj.close();
}
}
