//Find the factorial of a large number. 
#include <stdio.h>
int multiply(int a[],int n,int i){
    int carry=0;
    int pro;
    for(int k=0;k<n;k++){
        pro=(a[k]*i)+carry;
        a[k]=pro%10;
        carry=pro/10;
    }
    while(carry!=0){
        a[n]=carry%10;
        carry=carry/10;
        n++;
    }
    return n;
}
void factorial(int n){
    int res[1000];
    res[0]=1;
    int res_size=1;
    for(int i=2;i<=n;i++){
        res_size=multiply(res,res_size,i);
    }
    for(int j=res_size-1;j>=0;j--){
        printf("%d",res[j]);
    }
}
int main(){
    factorial(50);

}