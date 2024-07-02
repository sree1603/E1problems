public class exc3 {
   
    void div(int a,int b){
        try{
            if(a==0&&b==0){
                throw new IllegalArgumentException("you entered IllegalArguments");
            }
            else if(b==0){
                throw new ArithmeticException("you entered denominator as 0");
            }
            else{
                double divi=a/b;
                System.out.print("the division of "+a+" and "+b+" is"+divi);
            }
        }
        catch(IllegalArgumentException i){
            System.out.println(i.getMessage());
        }
        catch(ArithmeticException j){
            System.out.println(j.getMessage());
        }
    }
    public static void main(String args[]){
            exc3 n=new exc3();
            n.div(0,0);
            n.div(8,0);
            n.div(14,5);    
    }
}