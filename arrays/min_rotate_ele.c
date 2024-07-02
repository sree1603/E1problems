#include <stdio.h>
int mi_ele(int arr[],int n){
    int low=0;
    int high=n-1;
    int ans=100;
    if(arr[low]<arr[high]){
        return arr[low];
    }
    while(low<=high){
        int mid=(low+high)/2;
        if((arr[mid]==arr[low])&&(arr[mid]==arr[high])){
            ans=(ans>arr[mid])?arr[mid]:ans;
            high--;
            low++;
        }
        else if(arr[mid]>arr[high]){
           
            //ans=(ans>arr[mid])?arr[mid]:ans;
             low=mid+1;
        }
        else{
            ans=(ans>arr[mid])?arr[mid]:ans;
            high=mid-1;
        }
    }
    return ans;
}
int main(){
    int a[]={4,5,6,7,0,1,2,3};
    int n=sizeof(a)/sizeof(a[0]);
    int x=mi_ele(a,n);
    printf("%d",x);
}