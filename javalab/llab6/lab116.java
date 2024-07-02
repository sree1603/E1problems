
class Employee {
     String name;
    String address;
     double salary;
     String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    public double calculateBonus() {
        return salary * 0.1; 
    }

    public void generatePerformanceReport() {
        System.out.println("Performance report for " + name + " (" + jobTitle + ")");
        
    }

   
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: $" + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}


class Manager extends Employee {
    private int numberOfReports;

 
    public Manager(String name, String address, double salary, String jobTitle, int numberOfReports) {
        super(name, address, salary, jobTitle);
        this.numberOfReports = numberOfReports;
    }

    
    
    public double calculateBonus() {
        return salary * 0.2;
    }

    public void manageProjects() {
        System.out.println(name + " is managing projects.");
    }

  
   
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of reports: " + numberOfReports);
    }
}


class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
        super(name, address, salary, jobTitle);
        this.programmingLanguage = programmingLanguage;
    }

   
    public void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage + ".");
        
    }

    
   
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}


class Programmer extends Employee {
    private String preferredLanguage;

  
    public Programmer(String name, String address, double salary, String jobTitle, String preferredLanguage) {
        super(name, address, salary, jobTitle);
        this.preferredLanguage = preferredLanguage;
    }

    
    public void testCode() {
        System.out.println(name + " is testing code in " + preferredLanguage + ".");
        
    }

   
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Preferred Language: " + preferredLanguage);
    }
}

// Main class
public class lab116 {
    public static void main(String[] args) {
        // Create a Manager object
        Manager manager = new Manager("Alice", "123 Street", 80000, "Project Manager", 5);
        manager.displayDetails();
        manager.calculateBonus();
        manager.manageProjects();

        // Create a Developer object
        Developer developer = new Developer("Bob", "456 Avenue", 60000, "Software Developer", "Java");
        developer.displayDetails();
        developer.writeCode();

        // Create a Programmer object
        Programmer programmer = new Programmer("Carol", "789 Boulevard", 50000, "Programmer", "Python");
        programmer.displayDetails();
        programmer.testCode();
    }
}
