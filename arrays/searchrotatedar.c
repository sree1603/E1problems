//Given a sorted and rotated array arr[] of n distinct elements, the task is to find the index of given target element in the array. If target is not present in the array, return -1.
#include <stdio.h>
int findmin(int a[],int n,int t){
    int lb=0;
    int ub=n-1;
    while(lb<=ub){
    int mid=(lb+ub)/2;
    if(a[mid]==t){
        return mid;
    }
    else if(a[lb]<=a[mid]){
        if(t>=a[lb]&&t<a[mid]){
            ub=mid-1;
        }
        else{
            lb=mid+1;
        }
    }
    //if(a[mid]<=a[ub])
    else{
        if(t>a[mid]&&t<=a[ub]){
            lb=mid+1;
        }
        else{
            ub=mid-1;
        }
    }
    }
    return -1;
}
int main(){
    int a[]={4,5,6,7,0,1,2,3};
    int n=sizeof(a)/sizeof(a[0]);
    int x=findmin(a,n,2);
    if(x!=-1){
        printf("the index of target is %d",x);
        }
    else{
        printf("not found");
    }
}