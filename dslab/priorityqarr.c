#include <stdio.h>
#define MAX 100
void sort(int arr[],int n){
        int num,temp;
        for(int i=1; i<=n; i++){
            num=arr[i];
            for(int j=i-1; j>=0; j--){
                if(num>arr[j]){
                    temp=arr[j];
                    arr[j]=num;
                    arr[j+1]=temp;
                }
            }
        }
}
int arr[MAX];
int front=-1;
int rear=-1;
void deque(){
    if(front==-1){
        printf("queue is empty");
    }
    else{
        printf("the deleted element is : %d",arr[front++]);
    }
}
void enque(int val){
    if(rear>=MAX){
        printf("queue is full");
    }
    else{
        if(front==-1){
            front=0;
    }
    rear+=1;
    arr[rear]=val;
    sort(arr,rear);
}
}
void display(){
    for(int i=front; i<=rear; i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
}
int main(){
    int n;
    while(n!=4){
    printf("choose the queue operation \n\t 1.enque \n\t 2.deque \n\t 3.display \n\t 4.exit\n");
    scanf("%d",&n);
    switch(n){
        case 1:
                int x;
                printf("enter a element to enque : ");
                scanf("%d", &x);
                enque(x);
               
                break;
            case 2:
                deque();
                
                break;
            case 3:
                printf("the elements in the Queue are : ");
                display();
                break;
        
    }
    }
}