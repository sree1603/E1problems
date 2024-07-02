import java.util.Scanner;
public class Employee {
    double sal;
    int eno;
    int exp;
    String name;
    public void input() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Salary");
        sal = obj.nextDouble();
        System.out.println("Enter Employee number");
        eno = obj.nextInt();
        System.out.println("Enter Experince");
        exp = obj.nextInt();
        obj.nextLine(); 
        System.out.println("Enter Name");
        name = obj.nextLine();
        //adding money for salary
        if (exp > 5 && exp < 10) {
            sal = sal + sal * 0.1;
        }
        if (exp > 10 && exp < 20) {
            sal = sal + sal * 0.15;
        }
        if (exp > 20) {
            sal = sal + sal * 0.2;
        }
        System.out.println("Employee details input is succesfull");
    }

    public void display() {
        System.out.println("Name is" + name);
        System.out.println("Employee number" + eno);
        System.out.println("Salary" + sal);
        System.out.println("Experince is" + exp);
    }

    public static void main(String args[]) {
        int n;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter no.of employees you have");
        n = object.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < employees.length; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            employees[i] = new Employee();
            employees[i].input();
        }
        System.out.println("\nEmployee Details:");
        for (Employee employee : employees) {
            employee.display();
            System.out.println("\n---------------------------\n");
        }
    }
}
