public class swap{
    public static void main(String args[]){
        int a=8,b=9;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        /*with using 3rd variable
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a is "+a);
        System.out.println("b is "+b);*/
        //without using 3rd variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a is "+a);
        System.out.println("b is "+b);


    }
}