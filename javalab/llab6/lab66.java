class Shape{
    void printShape(){
        System.out.println("this is shape");
    }
}

class Rectangle extends Shape{
    void printRect(){
        System.out.println("this is rectangle");

    }
}

class Circular extends Shape{
    void printCircle(){
        System.out.println("this is circle");
    }
}

class Square extends Rectangle{
    void printSq(){
        System.out.println("Sqaure is a rectangle");
    }
}

public class lab66 {
    public static void main(String args[]){
        Square s=new Square();
        s.printRect();
        s.printShape();

    }
    
}
