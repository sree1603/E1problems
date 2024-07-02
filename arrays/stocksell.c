#include <stdio.h>
int main(){
    int arr[]={7,6,5,4,3,2,1};
    int n=sizeof(arr)/sizeof(arr[0]);
    int buy,sold=0,profit,min;
    buy=arr[0];
    for(int i=1;i<n;i++){
        if(arr[i]<buy){
        buy=arr[i];
        min=i;
        }
    }
    for(int j=min;j<n;j++){
        if(arr[j]>sold)
        sold=arr[j];
    }
    profit=sold-buy;
    printf("%d",profit);
}