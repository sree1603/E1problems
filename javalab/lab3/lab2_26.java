import java.util.Scanner;

import org.w3c.dom.Node;

class Stack{
        static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }

    Node Top=null;
    public void push(int x){
        Node newnode=new Node(x);
        if(Top==null){
            Top=newnode;

        }
        else{
           newnode.next=Top;
           Top=newnode;

        }
    }
    public void pop(){
        if(Top==null){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("the deleted element is:"+Top.data);
            Node temp=Top;
            Top=Top.next;
            temp.next=null;
        }

    }
    public void display(){
    
        Node temp=Top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    public void peek(){
        System.out.println("the peek element is:"+Top.data);
    }
}
    

public class lab2_26 {
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
                    System.out.println();
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
