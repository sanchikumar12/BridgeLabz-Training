import java.util.Random;

public class EmployeeBonus {

    // Method to generate random salary and years of service for 10 employees
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2]; // [salary, yearsOfService]
        Random rand = new Random();

        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = rand.nextInt(90000) + 10000; // 5-digit salary: 10000 to 99999
            data[i][1] = rand.nextInt(15) + 1;        // years of service: 1 to 15
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(int[][] data) {
        int numEmployees = data.length;
        double[][] newData = new double[numEmployees][2]; // [newSalary, bonusAmount]

        for (int i = 0; i < numEmployees; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }

        return newData;
    }

    // Method to calculate total old salary, total new salary, and total bonus
    public static void displayTotals(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");

        for (int i = 0; i < oldData.length; i++) {
            int oldSalary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            System.out.printf(i + 1, oldSalary, years, bonus, newSalary);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println(" ");
        System.out.printf(totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] newEmployeeData = calculateBonus(employeeData);
        displayTotals(employeeData, newEmployeeData);
    }
}
