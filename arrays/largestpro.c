//given  array that contains both positive and negative integers, the task is to find the product of the maximum product subarray. 
#include <stdio.h>
int max(int n1,int n2){
    return (n1>n2)?n1:n2;
}
int main(){
   int a[]={-2,-3,4,-1,0,-2,1,5,-3};
    int n=sizeof(a)/sizeof(a[0]);
    int pro=-1000;
    int l_to_r=1;
    int r_to_l=1;
    for(int i=0;i<n;i++){
        l_to_r*=a[i];
        r_to_l*=a[(n-1)-i];
        pro=max(max(l_to_r,r_to_l),pro);
        if(l_to_r==0)
        l_to_r=1;
        if(r_to_l==0)
        r_to_l=1;
    }
    printf("%d ",pro);
}