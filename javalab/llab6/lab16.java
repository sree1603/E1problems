import java.util.*;
class Stack {
    int top=-1;
    int arr[]=new int[100];
    void push(int x){
        if(top==100){
            System.out.println("stack is full.");
        }
        else{
            arr[++top]=x;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("the deleted element :"+arr[top--]);
        }
    }
    void peek(){
        System.out.println("the peek element is:"+arr[top]);
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }


}
public class lab16 {
    public static void main(String args[]){
        Stack obj=new Stack();
        Scanner sc=new Scanner(System.in);
        int x=4;
        while(x!=0){
            System.out.println("Enter 0->Exit 1->Push 2->Pop 3->Display 4->peek");
            x=sc.nextInt();
            switch(x){
                case 1:
                    int y;
                    System.out.print("enter the elemnt to push: ");
                    y=sc.nextInt();
                    obj.push(y);
                    System.out.println("Done");
                    break;
                case 2:
                    obj.pop();
                    System.out.println("Done");
                    break;
                case 3:
                    obj.display();
                    System.out.println("Done");
                    break;
                case 4:
                    obj.peek();
                    System.out.println("Done");
                    break;

            }


        }
       
    }
}
