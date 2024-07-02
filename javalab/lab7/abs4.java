abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
    public abstract void displayInfo();
}

class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager Name: " + name + ", ID: " + id + ", Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Programmer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayInfo() {
        System.out.println("Programmer Name: " + name + ", ID: " + id + ", Salary: " + calculateSalary());
    }
}

public class abs4 {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 1001, 5000.00, 1000.00);
        manager.displayInfo();

        Employee programmer = new Programmer("Bob", 1002, 50.00, 160);
        programmer.displayInfo();
    }
}
