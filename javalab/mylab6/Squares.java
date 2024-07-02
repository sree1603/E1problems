package mylab6;
class Rectangle{
    int length;
    int breadth;

    Rectangle(int l, int b){
        length=l;
        breadth=b;
    }

     long area(){
        int a=length*breadth;
        return a;
    }

    long perimeter(){
        int p=2*(length+breadth);
        return p;
    }
}

class Square extends Rectangle{
    Square(int s) {
        super(s,s);       
    }

}
public class Squares{
    public static void main(String[] args){
        Square[] q=new Square[10];
        q[0]=new Square(1);
        q[1]=new Square(2);
        q[2]=new Square(3);
        q[3]=new Square(4);
        q[4]=new Square(5);
        q[5]=new Square(6);
        q[6]=new Square(7);
        q[7]=new Square(8);
        q[8]=new Square(9);
        q[9]=new Square(10);
        for(int i=0; i<q.length; i++){
            long area=q[i].area();
            long perimeter=q[i].perimeter();
            System.out.printf("Square%d : \n area : %d \n perimeter : %d \n",i+1,area,perimeter);
        }                  
         
}
}