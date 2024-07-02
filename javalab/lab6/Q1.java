import java.util.*;
public class Q1 {
        private int maxSize;
        private int[] stackArray;
        private int top;
        static Scanner s = new Scanner(System.in);
        public Q1(int s) {
            maxSize = s;
            stackArray = new int[s];
            top = -1;
        }
        public void push(int item) {
            if (top == maxSize - 1) {
                System.out.println("stack is empty,cannot insert");
            } else {
                top++;
                stackArray[top] = item;
            }
        }
        public void pop() {
            if (top == -1) {
                System.out.println("stack is empty");
            } else {
                System.out.println("element popped: " + stackArray[top]);
                top--;
            }
        }
        public void display(){
            for(int i=top;i>=0;i--){
                System.out.print(stackArray[i]+" ");
            }
        }
        public int peek() {
            return stackArray[top];
        }
        public static void main(String args[]) {
            Q1 stack = new Q1(5);
            for (int i = 0; i < 5; i++) {
                int k;
                System.out.print("enter element ");
                k = s.nextInt();
                stack.push(k);

            }
            System.out.print("Enter \n1-pop\n2-peek\n3-display: ");
            int n=s.nextInt();
            switch(n){
                case 1:
                    stack.pop();
                    break;
                case 2:
                    int t=stack.peek();
                    System.out.print("Peek element is: "+t+"\n");
                    break;
                case 3:
                    stack.display();
                    break;
            }
        }
    }