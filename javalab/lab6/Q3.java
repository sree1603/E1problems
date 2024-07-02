class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }
}

public class Q3{
    public static void main(String[] args) {
        Employee emp = new Employee("John", 30, "1234567890", "123 Street, City", 50000, "Java Developer");
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        System.out.println("Salary: " + emp.salary);
        System.out.println("Specialization: " + emp.specialization);
        
        Manager manager = new Manager("Alice", 35, "0987654321", "456 Avenue, Town", 80000, "HR");
        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Salary: " + manager.salary);
        System.out.println("Department: " + manager.department);
        manager.printSalary(); 
    }
}