#include <stdio.h>
int main(){
    int arr[3][3]={{1,1,1},{2,2,2},{3,3,3}};
    int n=3;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
           int temp=arr[i][j];
           arr[i][j]=arr[j][i];
           arr[j][i]=temp;
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            printf("%d",arr[i][j]);
        }
        printf("\n");
    }
}