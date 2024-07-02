import java.lang.Math.*;
import java.util.*;
abstract class Shape {
   
    
    
    public  abstract void calculateArea();
    public  abstract void calculatePerimeter();
}
class Circle extends Shape {
    int radius;
    Circle(int r){
        this.radius=r;
    }
    public  void  calculateArea(){
        System.out.println("Area of Circle :"+(Math.PI*radius*radius));
}
   public  void  calculatePerimeter(){
        System.out.println("perimeter of Circle: "+2*Math.PI*radius);
}


 
}
class rectangle extends Shape {
    int len;
    int bre;
    rectangle(int length,int breadth){
        this.len=length;
        this.bre=breadth;

    }
     public void calculateArea(){
        System.out.println("Area of Rectangle: "+len*bre);
    
}
    public  void  calculatePerimeter(){
        System.out.println("Perimeter of Rectangle: "+2*(len+bre));
}

}
public class abs2 {
    public static void main(String args[]){
        Shape A=new Circle(5);
        A.calculatePerimeter();
        A.calculateArea();
        Shape b=new rectangle(2,3);
         b.calculatePerimeter();
        b.calculateArea();
    }
}