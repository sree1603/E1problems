package mylab6;
class Member{
    String name;
    int age;
    long Phno;
    String address;
    int salary;

    Member(String n, int a, long p, String add, int s){
        name=n;
        age=a;
        Phno=p;
        address=add;
        salary=s;
    }

    void printSalary(){
        System.out.println(name+" salary is "+salary);
    }
}
class Employee extends Member{
    String Specialisation;

    Employee(String n, int a, long p, String add, int s, String sp){
        super(n, a, p, add, s);
        Specialisation=sp;
    }
    
}
class Manager extends Member{
    String Department;

    Manager(String n, int a, long p, String add, int s, String d){
        super(n, a, p, add, s);
        Department=d;
    }

}
public class Company{
    public static void main(String[] args){
        Employee e=new Employee("Bindu", 21, 96763938, "Gudivada", 700000, "Developer");
        Manager m=new Manager("Ramu", 24, 90145515, "Polkonda", 100000, "Python" );
        System.out.println("Employee Details:");
        System.out.println("Name: " + e.name);
        System.out.println("Age: " + e.age);
        System.out.println("Phone Number: " + e.Phno);
        System.out.println("Address: " + e.address);
        System.out.println("Salary: " + e.salary);
        System.out.println("Specialization: " + e.Specialisation);
        e.printSalary();

        System.out.println();

        System.out.println("Manager Details:");
        System.out.println("Name: " + m.name);
        System.out.println("Age: " + m.age);
        System.out.println("Phone Number: " + m.Phno);
        System.out.println("Address: " + m.address);
        System.out.println("Salary: " + m.salary);
        System.out.println("Department: " + m.Department);
        m.printSalary();
    }
}
