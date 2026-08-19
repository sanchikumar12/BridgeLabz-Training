package Day_12_Hackerrank;

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void getDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : $" + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Team Size     : " + teamSize + " members");
    }
}

public class Q4 {
    public static void main(String[] args) {
        System.out.println("=== Employee Details ===");
        Employee emp = new Employee("Rohan Verma", 55000);
        emp.getDetails();

        System.out.println("\n=== Manager Details (Overriding + super.getDetails()) ===");
        Manager mgr = new Manager("Priya Sharma", 125000, 10);
        mgr.getDetails();
    }
}
