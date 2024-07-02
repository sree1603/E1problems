package mylab6;
class shape{
    void printShape(){
        System.out.println("This is shape.");
    }
}
class Rectangle extends shape{
    void printRect(){
        System.out.println("This is rectangular shape.");
    }
}
class Square extends Rectangle{
    void printsq(){
        System.out.println("Square is a rectangle");
    }
}
class Circle extends shape{
    void printCircle(){
        System.out.println("This is circular shape.");
    }
}
public class Shapes {
    public static void main(String[] args){
        Square q=new Square();
        q.printShape();
        q.printRect();
        q.printsq();
    }
}
