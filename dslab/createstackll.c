#include <stdio.h>
#include <stdlib.h>
struct node{
    int data;
    struct node *next;
}*start=NULL,*temp,*p;
void push(){
       //creating stack using linked lists
    int y;
    printf("enter the element to push into the stack : ");
    temp=(struct node *)malloc(sizeof(struct node));
    scanf("%d", &y);
    temp->data=y;
    temp->next=NULL;
    if(start==NULL)
    start=temp;
    else{
        temp->next=start;
        start=temp;
    }
}
void display(){
    printf("the elements of the stack : ");
    p=start;
    while(p!=NULL){
        printf("%d ", p->data);
        p=p->next;
    }
    printf("\n");
}
void pop(){
    temp=start;
    start=start->next;
    temp->next=NULL;
    free(temp);
}
void peak(){
    if(start==NULL);
    else{
    int a;
    a=start->data;
    printf("%d\n", a);
}
}
int main(){
    int s;
    do{
        printf("enter s where \n \t s=0 -> Exit \n\t s=1 -> Push operation \n\t s=2 -> Pop operation \n\t s=3 -> Peak operation \n\t s=4 -> Display \n");
        scanf("%d", &s);
        switch(s){
            case 0:
                
                exit(0);
            case 1:
                int x;
                push(x);
                display();
                break;
            case 2:
                pop();
                display();
                break;
            case 3:
                peak();
                break;
                
            case 4:
                display();
                break;
        }
        }while(s!=0);
}
    
 

