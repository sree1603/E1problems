#include <stdio.h>
#include <stdlib.h>
struct node{
    struct node *prev;
    int data;
    struct node *next;
}*start=NULL,*p,*temp,*end;
int main(){
    int num,x,y,j;
    printf("enter the no of elements that should be a positive num ");
    scanf("%d",&num);
    if(num<=0)
    printf("it is not a valid number \n");
    else{
    for(j=1; j<=num; j++){
    temp=(struct node *)malloc(sizeof(struct node));
    temp->prev=NULL;
    printf("enter the %d element ",j);
    scanf("%d", &x);
    temp->data=x;
    temp->next=NULL;
    if(start==NULL){
        start=temp;
        end=temp;
    }
    else{
        end->next=temp;
        temp->prev=end;
        end=end->next;
    }
    }
        if(start==NULL)
        printf("double linked list is empty \n");
        else{
            printf("the elemnts of given double linked list are : ");
            p=start;
            while(p!=NULL){
                printf("%d ",p->data);
                p=p->next;
            }
        }
    printf("\n");
    int delnum, pos=0, flag=0;
    printf("enter a number to delete it from dll ");
    scanf("%d",&delnum);
    p=start;
    while(p!=NULL){
        pos++;
        if(p->data==delnum){
            flag=1;
            break;
        }
        else
            p=p->next;
    }
    if(flag==0)
    printf("element not found ");
    else{
        if(pos==1){
            temp=start;
            temp->next->prev=NULL;
            start=start->next;
            temp->next=NULL;
            free(temp);
        }
        else if(pos==num){
            p=end->prev;
            temp=end;
            p->next=NULL;
            end=temp->prev;
            temp->prev=NULL;
            free(temp);
        }
        else{
            p=start;
            for(int i=1; i<pos-1; i++){
                p=p->next;
            }
            temp=p->next;
            p->next=temp->next;
            temp->next->prev=p;
            temp->next,temp->prev=NULL;
            free(temp);
        }

    printf("the elements after deleting %d are ",delnum);
    
    p=start;
    while(p!=NULL){
        printf("%d ",p->data);
        p=p->next;
    }
    }
    printf("\n");
    }
}