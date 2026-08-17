package Day12_Hackerrank;

class Employee {

    private static int counter = 1001;

    private int employeeId;
    String name;

    Employee(String name) {
        this.name = name;
        this.employeeId = counter++;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

public class Q4 {

    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul");
        Employee e2 = new Employee("Aman");
        Employee e3 = new Employee("Sanchit");
        Employee e4 = new Employee("Riya");

        System.out.println(e1.name + " - " + e1.getEmployeeId());
        System.out.println(e2.name + " - " + e2.getEmployeeId());
        System.out.println(e3.name + " - " + e3.getEmployeeId());
        System.out.println(e4.name + " - " + e4.getEmployeeId());
    }
}