import java.util.Scanner;


class Queue{
    int arr[]=new int[100];
    int front=-1;
    int rear=-1;
    
    void enque(int x){
        if(rear==100){
            System.out.println("Queue is full");
        }
        else{
            if(front==-1)
                front=0;
            arr[++rear]=x;
            
        }
        
    }
    void deque(){
        if(rear==-1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("the deleted element is:"+arr[front++]);
            
        }
    }
    void display(){
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       
    }
}
public class lab1_26 {
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
