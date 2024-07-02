public class lab46 {
    public static void main(String args[]){
        Rectangle obj1=new Rectangle(2,3);
        Square obj2=new Square(2);
        obj2.Area();
        obj2.perimeter();
        obj1.Area();
        obj1.perimeter();

    }
    
}
 class Rectangle{
    int length,breadth;
    Rectangle(int len,int brea){
        this.length=len;
        this.breadth=brea;

    }
    public void Area(){
        System.out.printf("the area of rectangle with parameters %d and %d is: %d \n",length,breadth,length*breadth);
    }
    public void perimeter(){
      
        System.out.printf("the perimeter of rectangle with parameters %d and %d is: %d \n",length,breadth,2*(length+breadth));
     
    }
}
class Square extends Rectangle{
    Square(int s){
        super(s,s);
    }
}

