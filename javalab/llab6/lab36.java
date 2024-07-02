// Base class: Member
class Member {
    // Data members
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected double salary;

    // Constructor
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: $" + salary);
    }

    // Method to print member details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
    }
}

// Subclass: Employee
class Employee extends Member {
    // Additional data member for Employee
    private String specialization;

    // Constructor
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    // Method to print employee details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

// Subclass: Manager
class Manager extends Member {
    // Additional data member for Manager
    private String department;

    // Constructor
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    // Method to print manager details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

// Main class
public class lab36 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", 30, "123-456-7890", "456 Avenue", 50000.00, "Software Engineering");
        System.out.println("Employee Details:");
        employee.displayDetails();
        System.out.println();

        // Create a Manager object
        Manager manager = new Manager("Jane Smith", 45, "987-654-3210", "789 Boulevard", 80000.00, "IT");
        System.out.println("Manager Details:");
        manager.displayDetails();
    }
}
