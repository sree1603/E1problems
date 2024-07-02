#include <stdio.h>
#include <stdlib.h>
struct node{
    int data;
    struct node *next;
}*start=NULL,*p,*temp;
int main(){
    int num;
    printf("enter the  no.of elements: ");
    scanf("%d",&num);
    for(int i=0;i<num;i++){
        int x;
        temp=(struct node*)malloc(sizeof(struct node));
        printf("enter the %d element: ",i);
        scanf("%d",&x);
        temp->data=x;
        temp->next=NULL;
        if(start==NULL){
            start=temp;
            p=temp;
        }
        else{
            p->next=temp;
            p=temp;
        }

    }
    if(start==NULL){
        printf("linked list is empty");
    }
    else{
        p=start;
        printf("the elements are: ");
        while(p!=NULL){
            int y=p->data;
            printf("%d ",y);
            p=p->next;
        }
    }
    printf("\n");
    int ele=0;
    printf("enter the element: ");
    scanf("%d",&ele);
    int pos=0,flag=0;
    p=start;
    while(p!=NULL){
        pos++;
        if(p->data==ele){
            flag=1;
            break;
        }
        p=p->next;
    }
    if(flag==0){
        printf("element not found");
    }
    else{
        if(pos==1){
            if(start->next==NULL){
                temp=start;
                start=NULL;
                free(temp);
            }
            else{
                temp=start;
                start=start->next;
                temp->next=NULL;
                free(temp);
            }
        }
        else if(pos==num){
            p=start;
            while(p->next->next!=NULL){
                p=p->next;
            }
            temp=p->next;
            p->next=NULL;
            free(temp);

        }
        else{
            p=start;
            for(int i=1;i<pos-1;i++){
                 p=p->next;
            }
            temp=p->next;
            p->next=temp->next;
            temp->next=NULL;
            free(temp);
        }
        printf("the elements after deletion are: ");
        p=start;

        while(p!=NULL){
            printf("%d ",p->data);
            p=p->next;
        }
        
    }
}