package Day_12_Hackerrank;

class SalaryCalculator {

    public double calculateSalary(double basicSalary) {
        return basicSalary;
    }

    public double calculateSalary(double basicSalary, double bonus) {
        return basicSalary + bonus;
    }

    public double calculateSalary(double basicSalary, double bonus, double deduction) {
        return basicSalary + bonus - deduction;
    }
}

public class Q3 {
    public static void main(String[] args) {
        SalaryCalculator calc = new SalaryCalculator();

        double s1 = calc.calculateSalary(50000);
        double s2 = calc.calculateSalary(50000, 8000);
        double s3 = calc.calculateSalary(50000, 8000, 3500);

        System.out.println("=== Employee Salary System (Method Overloading) ===");
        System.out.println("1. Basic Only                     : $" + s1);
        System.out.println("2. Basic + Bonus                  : $" + s2);
        System.out.println("3. Basic + Bonus - Deductions     : $" + s3);
    }
}
