#include <stdio.h>
#include <stdlib.h>
#define MAX 100
int arr[MAX];
int top=-1;
void push(int t){
        top=top+1;
        arr[top]=t;
}
void pop(){
    if(top==-1){}
    else
    top=top-1;
}
void peak(){
    if(top==-1){
        printf("stack is empty \n");
    }
    else
        printf("the peak element is %d \n", arr[top]);
}
void traverse(){
    if(top==-1)
        printf("stack is empty\n");
    else{
        int e=top;
        printf("the stack is ");
        while(e>=0){
            printf("%d ",arr[e]);
            e=e-1;
        }
        printf("\n");
       
        }
}
void main(){
    int s;
    do{
        printf("enter s where \n \t s=0 -> Exit \n\t s=1 -> Push operation \n\t s=2 -> Pop operation \n\t s=3 -> Peak operation \n\t s=4 -> Display \n");
        scanf("%d", &s);
        switch(s){
            case 0:
                
                exit(0);
            case 1:
                int x;
                printf("enter a element to push into the stack : ");
                scanf("%d", &x);
                push(x);
                traverse();
                break;
            case 2:
                pop();
                traverse();
                break;
            case 3:
                peak();
                break;
                
            case 4:
                traverse();
                break;
        }
        }while(s!=0);
        
}
