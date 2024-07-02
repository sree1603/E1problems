#include <stdio.h>
struct node{
    int data;
    struct node *prev;
    struct node *next;
}*start=NULL,*p,*temp,*end;
void enque(){
    int x;
    printf("enter a number : ");
    scanf("%d",&x);
    temp=(struct node *)malloc(sizeof(struct node));
    temp->data=x;
    temp->next=temp->prev=NULL;
    if(start==NULL){
        start=end=temp;
    }
    else{
        end->next=temp;
        temp->prev=end;
        end=temp;
    }
}
void deque(){
    temp=start;
    printf("the dequed element is : %d\n",temp->data);
    start=start->next;
    start->prev=NULL;
    temp->next=NULL;
    free(temp);
}
void display(){
    printf("the queue is : ");
    p=start;
    while(p!=NULL){
        printf("%d ",p->data);
        p=p->next;
    }
    printf("\n");
}
int main(){
    int n=0;
    while(n!=4){
    printf("choose the queue operation \n\t 1.enque \n\t 2.deque \n\t 3.display \n\t 4.exit\n");
    scanf("%d",&n);
    switch(n){
        case 1:
                enque();
               
                break;
            case 2:
                deque();
                
                break;
            case 3:
                display();
                break;
        
    }}
}