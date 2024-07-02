#include <stdio.h>
#include <stdlib.h>
int CQ[100];
int front=-1;
int rear=-1;
int i,x,n;
void enque(){
    if(front==(rear+1)%100)
    printf("cqueue is full\n");
    else{
        rear=(rear+1)%100;
        printf("enter data : ");
        scanf("%d", &x);
        CQ[rear]=x;
        if(front==-1){
            front=0;
        }
    }
}
void deque(){
    if(front==-1)
    printf("circular queue is empty ");
    else if(front==rear)
    {printf("deleted element is %d \n",CQ[front]);
    front=rear=-1;
    }
    else{
        printf("deleted element is %d \n",CQ[front]);
        front=(front+1)%100;
    }
}
void traverse(){
    if(front==-1)
    printf("circular queue is underflow ");
    else
   { 
    i=front;
    do{
        printf("%d ", CQ[i]);
        i=(i+1)%100;
    }while(i!=(rear+1)%100);
    }
    printf("\n");
}
void main(){
    int n;
    while(n!=4){
        printf("enter required queue operation  \n 1. enqueue \n 2.dequeue \n 3.display \n 4.exit \n");
        scanf("%d", &n);
        switch(n){
            case 1:
                enque();
                break;
            case 2:
                deque();
                break;
            case 3:
                traverse();
                break;
            case 4:
                exit(1);
        }
        }
}
