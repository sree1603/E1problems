package mylab6;

class Rectangle{
    int length;
    int breadth;

    Rectangle(int l, int b){
        length=l;
        breadth=b;
    }

    void area(){
        int a=length*breadth;
        System.out.println("area : "+a);
    }

    void perimeter(){
        int p=2*(length+breadth);
        System.out.println("perimeter : "+p);
    }
}

class Square extends Rectangle{

    Square(int s) {
        super(s,s);       
    }

}
public class Rect {
    public static void main(String[] args){
        Square q=new Square(5);
        System.out.println("Square : ");
        q.area();          
        q.perimeter(); 
        Rectangle t=new Rectangle(5, 8);
        System.out.println("Rectangle : ");
        t.area();
        t.perimeter();
    }
}
