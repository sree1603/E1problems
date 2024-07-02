#include <stdio.h>
int main(){
    int x=-2;
    int a[]={0,-1,2,-3,1};
    int flag=0;
    int n=sizeof(a)/sizeof(a[0]);
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]+a[j]==x){
                flag=1;
                break;
            }
        }
    }
    if(flag==1)
    printf("yes \n");
    else
    printf("no \n");
}