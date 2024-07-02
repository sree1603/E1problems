public class Queue {
    private int maxsize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int numOfItems;
    public Queue(int s)
    {
        maxsize=s;
        queueArray=new int[s];
        front=0;rear=-1;numOfItems=0;
    }
    public int peekFront()
    {
        return queueArray[front];
    }
    public int peekRear()
    {
        return queueArray[rear];
    }
    public boolean checkEmpty()
    {
        return numOfItems==0;
    }
    public boolean checkFull()
    {
        return numOfItems==maxsize;
    }
    public void enqueue(int item)
    {
        if(checkFull())
        {
            System.out.println("queue is Full ,cananot insert");
        }
        else {
            rear++;
            queueArray[rear]=item;
            numOfItems++;
        }
    }
    public void dequeue()
    {
        if(checkEmpty())
        {
            System.out.println("queue empty ,cannot dequeue element");
        }
        else {
            System.out.println("queue dequeue element"+queueArray[front]);
            front++;
            numOfItems--;
        }
    }
    public static void main(String args[])
    {
        Queue queue=new Queue(5);
        queue.enqueue(10);
        System.out.println("element inserted "+queue.peekRear());
        queue.enqueue(33);
        System.out.println("element inserted "+queue.peekRear());
        queue.enqueue(16);
        System.out.println("element inserted "+queue.peekRear());
        queue.enqueue(80);
        System.out.println("element inserted "+queue.peekRear());

    }

}