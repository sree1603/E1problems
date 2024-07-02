#include <stdio.h>
#include <stdlib.h>
int main(){
    int a[]={2,6,5,3,2,4,2,4,8,5,7,5};
    int n=sizeof(a)/sizeof(a[0]);
    int max=a[0];
    for(int i=1;i<n;i++){
        if(a[i]>max)
        max=a[i];
    }
    int *hash=(int*)calloc(max+1, sizeof(int*));
    for(int i=0;i<n;i++){
        hash[a[i]]++;
    }
    for(int j=0;j<max;j++){
        if(hash[j]>1)
        printf("%d ",j);
    }
    printf("\n");
}