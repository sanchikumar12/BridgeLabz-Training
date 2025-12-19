import java.util.Scanner;

public class BonusCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] service = new double[10];

        double[] newSalary = new double[10];
        double[] bonus = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        System.out.println("---- Enter Employee Details ----");

        // INPUT Loop with Validation
        for (int i = 0; i < 10; i++) {

            System.out.println("\nEmployee " + (i + 1));

            // Salary Input Validation
            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();
            if (sal <= 0) {
                System.out.println("Invalid salary! Enter again.");
                i--;     // repeat this index
                continue;
            }

            salary[i] = sal;

            // Years of Service Validation
            System.out.print("Enter Years of Service: ");
            double yrs = sc.nextDouble();
            if (yrs < 0) {
                System.out.println("Invalid years! Enter again.");
                i--;     // repeat this index
                continue;
            }

            service[i] = yrs;
        }

 
        for (int i = 0; i < 10; i++) {

            double sal = salary[i];
            double yrs = service[i];

            double empBonus;

            if (yrs > 5)
                empBonus = sal * 0.05;   // 5% bonus
            else
                empBonus = sal * 0.02;   // 2% bonus

            bonus[i] = empBonus;
            newSalary[i] = sal + empBonus;

            totalBonus += empBonus;
            totalOldSalary += sal;
            totalNewSalary += newSalary[i];
        }

       
        System.out.println("Total Old Salary of All Employees : " + totalOldSalary);
        System.out.println("Total Bonus to be Paid            : " + totalBonus);
        System.out.println("Total New Salary of All Employees : " + totalNewSalary);

        sc.close();
    }
}
