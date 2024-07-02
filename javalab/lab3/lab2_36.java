import java.util.Scanner;

import org.w3c.dom.Node;

class Queue {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
    Node temp=null;
    Node front=null;
    Node rear=null;
    void enque(int x){
        Node newnode=new Node(x);
        if(rear==null){
           front=rear=newnode;
        }
        else{
            rear.next=newnode;
            rear=rear.next;
        }

    }
    void deque(){
        if(front==null){
            System.out.println("queue is empty");
        }
        else{
            System.out.println("the deleted element is "+front.data); 
           temp=front;
           front=front.next;
           temp.next=null;
        }

    }
    void display(){
        temp=front;
        while(temp!=rear){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
    }
}


public class lab2_36 {
    public static void main(String args[]){
    Queue obj=new Queue();
        Scanner sc=new Scanner(System.in);
        int x=78;
        while(x!=0){
            System.out.println("Enter 0->Exit 1->enque 2->deque 3->Display ");
            x=sc.nextInt();
            switch(x){
                case 1:
                    int y;
                    System.out.print("enter the elemnt to push: ");
                    y=sc.nextInt();
                    obj.enque(y);
                    System.out.println("Done");
                    break;
                case 2:
                    obj.deque();
                    System.out.println("Done");
                    break;
                case 3:
                    obj.display();
                    System.out.println("Done");
                    break;
               

            }


           }
   }
    
}
