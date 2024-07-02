#include <stdio.h>
int main(){
    int a[]={0, -1, 2, -3, 1};
    int n=sizeof(a)/sizeof(a[0]);
    for(int i=0;i<n-2;i++){
        if(a[i]+a[i+1]+a[i+2]==0){
            printf("%d, %d, %d \n",a[i],a[i+1],a[i+2]);
        }
    }
}