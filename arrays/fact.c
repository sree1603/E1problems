//Find the factorial
#include <stdio.h>
int fact(int n){
   return (n==0||n==1)?1:n*fact(n-1);
}
int main(){
    int n=17;
    printf("%d",fact(n));
}