import java.util.*;
public class lab56 {
    public static void main(String args[]){
       Square[] obj=new Square[10];
       for(int i=0;i<10;i++){
        int x;
        System.out.printf("enter the %d element:",i+1);
        Scanner o=new Scanner(System.in);
        x=o.nextInt();
         obj[i]=new Square(x);
         obj[i].Area();
       }

    }
    
}
 class Rectangle{
    int length,breadth;
    Rectangle(int len,int brea){
        this.length=len;
        this.breadth=brea;

    }
    public void Area(){
        System.out.printf("the area of polygon with side %d is %d \n",length,length*breadth);
    }
    public void perimeter(){
      
        System.out.printf("the perimeter of polygon with parameters %d  is: %d \n",length,2*(length+breadth));
     
    }
}
class Square extends Rectangle{
    Square(int s){
        super(s,s);
    }
}


