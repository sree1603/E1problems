//Given an array of distinct elements. The task is to find triplets in the array whose sum is zero.
//using sorting technique.
#include <stdio.h>
void swap(int *a,int *b){
    int temp=*a;
    *a=*b;
    *b=temp;
}
int partition(int a[],int lb,int ub){
    int pivot=a[lb];
    int i=lb;
    int j=ub;
    while(i<j){
        while(a[i]<=pivot){
            i++;
        }
        while(a[j]>pivot){
            j--;
        }
        if(i<j){
            swap(&a[i],&a[j]);
        }
    }
    swap(&a[lb],&a[j]);
    return j;
}
void Quicksort(int a[],int lb,int ub){
   if(lb<ub){
    int loc=partition(a,lb,ub);
    Quicksort(a,lb,loc-1);
    Quicksort(a,loc+1,ub);}
}
int main(){
    int a[]={0, -1, 2, -3, 1};
    int n=sizeof(a)/sizeof(a[0]);
    int found=0;
    Quicksort(a,0,n-1);
    // for(int i=0;i<n;i++){
    //     printf("%d ",a[i]);
    // }
    for(int i=0;i<n-1;i++){
        int l=i+1;
        int r=n-1;
        while(l<r){
            if(a[i]+a[l]+a[r]<0){
            l++;
        }
            else if(a[i]+a[l]+a[r]>0){
            r--;
        }
        else{
            printf("%d, %d, %d \n",a[i],a[l],a[r]);
            found=1;
            l++;
            r--;
        }}
    }
    if(found==0){
        printf("no such triplets whose sum is 0\n");
    }
}