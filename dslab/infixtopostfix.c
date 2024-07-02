#include <stdio.h>
#include <string.h>
#include <ctype.h>
#define MAX 100
char arr[MAX];
int top=-1;
void push(char t){
    top=top+1;
    arr[top]=t;
}
void pop(){
    top=top-1;
}

int ash(char h){
    switch(h){
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
        case '%':
            return 2;
        default:
            return 0;
    }
}
int main(){
    char instr[MAX];
    printf("enter a infix expression : ");
    scanf("%s", instr);
    int l=strlen(instr);
    char outstr[l];
    for(int i=0; i<l; i++){
        if(isalnum(instr[i])){
            strncat(outstr,(const char *)&instr[i],1);
        }
        else if(instr[i]=='('){
            push(instr[i]);
        }
        else if(instr[i]==')'){
            while(arr[top]!='('&&top!=-1){
                strcat(outstr,(const char *)&arr[top]);
                pop();
            }
            if(top!=-1 && arr[top]=='(')
                    pop();
            
        }
        else{
            while(ash(instr[i])<=ash(arr[top])&&top!=-1){
                strncat(outstr,(const char *)&arr[top],1);
                pop();
            }
            push(instr[i]);
        }
    }
    while(top!=-1){
        strncat(outstr,(const char *)&arr[top],1);
        pop();
    }
    outstr[l]='\0';
    printf("the postfix expression is %s",outstr);

}