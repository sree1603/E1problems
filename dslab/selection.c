#include <stdio.h>
int main(){
    int l;
    printf("enter the size of array : ");
    scanf("%d", &l);
    int arr[l];
    printf("enter the array elements : \n");
    for(int k=0;k<l;k++){
        scanf("%d",&arr[k]);
    }
    for(int i=0;i<l;i++){
        int min=i;
        for(int j=i+1;j<l;j++){
            if(arr[j]<arr[min])
                min=j;
        }
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;

    }
    for(int i=0; i<l; i++){
        printf("%d ",arr[i]);
    }
}