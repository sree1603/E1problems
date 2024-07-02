import java.util.*;
public class sortedarray{
    public static void main(String args[]){
        
        System.out.print("enter the length of  sorted array1:");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.print("enter the length of  sorted array1:");
        int m=obj.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for (int i=0;i<n;i++){
            System.out.print("enter the arr1["+i+"]: ");
            arr1[i]=obj.nextInt();
        }
        for (int i=0;i<m;i++){
            System.out.print("enter the arr2["+i+"]: ");
            arr2[i]=obj.nextInt();
        }
        int arr3[]=new int[m+n];
        for(int i=0;i<n;i++){
            arr3[i]=arr1[i];
        }
        int j=n,k=0;
        while(k<m){
            arr3[j]=arr2[k];
            k++;
            j++;
        }
       
        int temp=0;int len=m+n;
        for(int i=0;i<len-1;i++){
            for(int l=0;l<len-i-1;l++){
                if(arr3[l+1]<arr3[l]){
                    temp=arr3[l];
                    arr3[l]=arr3[l+1];
                    arr3[l+1]=temp;
                }

            }
        }
        for(int i=0;i<n;i++){
            arr1[i]=arr3[i];
        }
        int u=0,h=n;
        for(u=0,h=n;u<m;u++,h++){
            arr2[u]=arr3[h];
        }
        for (int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
           
        }
        System.out.println();
        for (int i=0;i<m;i++){
            System.out.print(arr2[i]+" ");
          
        }
        obj.close();
    }
}