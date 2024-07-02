class Person{
    String fn;
    String ln;
    
    String getFirstName(){
        return fn;
    }
    
    String getlastName(){
        return ln;
    }
}
class Employee extends Person{
    int employID;
    String title;
    Employee(String fn,String ln,int ID,String title){
        this.fn=fn;
        this.ln=ln;
        employID=ID;
        this.title=title;

    }
    String getlastName(){
        String s=super.getlastName()+" as "+title;
        return s;
    }
    int getEmployeeId(){
        return employID;
    }
}
public class lab96 {
    public static void main(String args[]){
        Employee e=new Employee("leela","parvathi",760,"python developer");
    System.out.printf("firstname: %s lastname with job title: %s employID :%d ",e.getFirstName(),e.getlastName(),e.getEmployeeId());
    }
    
}
