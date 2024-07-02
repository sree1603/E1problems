//Given  array arr[] of n integers, construct a Product Array prod[] (of the same size) such that prod[i] is equal to the product of all the elements of arr[] except arr[i]. 
//using one extra array to solve
#include <stdio.h>
int main(){
    int arr[]={1,2,3,4,5};
    int n=sizeof(arr)/sizeof(arr[0]);
    int pro[n];
    int temp=1;
    for(int i=0;i<n;i++){
        pro[i]=temp;
        temp=temp*arr[i];
    }
    temp=1;
    for(int i=n-1;i>=0;i--){
        pro[i]=pro[i]*temp;
        temp=temp*arr[i];
    }
    for(int i=0;i<n;i++){
        printf("%d ",pro[i]);
    }
}