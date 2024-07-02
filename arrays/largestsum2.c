//Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within a arr[] with the largest sum. 
#include <stdio.h>
int main(){
    int a[]={-2,-3,4,-1,-2,1,5,-3};
    int n=sizeof(a)/sizeof(a[0]);
    int max=-1000;
    int sum=0;
    for(int i=0;i<n;i++){
        sum=sum+a[i];
        if(max<sum)
        max=sum;
        if(sum<0)
        sum=0;
    }
    printf("%d ",max);
}