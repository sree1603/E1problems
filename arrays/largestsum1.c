//Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within a arr[] with the largest sum. 
#include <stdio.h>
int main(){
    int a[]={-2,-3,4,-1,-2,1,5,-3};
    int n=sizeof(a)/sizeof(a[0]);
    int sum=0;
    int max_sum=-1000;
    int start,end;
    for(int i=0;i<n;i++){
        sum=a[i];
        for(int j=i+1;j<n;j++){
            sum=sum+a[j];
            if(sum>max_sum){
            max_sum=sum;
            start=i;
            end=j;
            }
        }
    }
    printf("%d\n",max_sum);
    for(int k=start;k<end+1;k++){
        printf("%d ",a[k]);
    }
}