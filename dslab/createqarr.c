#include <stdio.h>
#include <stdlib.h>
#define MAX 100
int arr[MAX];
int x,front=0,rear=-1;
void enqueue(){
    int x;
    printf("enter the number to enqueue to stack : ");
    scanf("%d", &x);
    if(rear>=MAX-1)
    printf("queue is full\n");
    else{
        rear=rear+1;
        arr[rear]=x;
    }
}
void dequeue(){
    front=front+1;
}
void display(){
    printf("the queue is ");
    for(int i=front;i<=rear;i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
}
void main(){
    int s;
    do{
        printf("enter s where \n \t s=0 -> Exit \n\t s=1 -> enqueue operation \n\t s=2 -> dequeue operation \n\t s=3 -> display \n");
        scanf("%d", &s);
        switch(s){
            case 0:
                
                exit(0);
            case 1:
                enqueue();
                display();
                break;
            case 2:
                dequeue();
                display();
                break;
            case 3:
                display();
                break;
        }
        }while(s!=0);
}
