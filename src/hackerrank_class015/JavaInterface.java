package hackerrank_class015;

import java.util.*;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class JavaInterface {
    public static void main(String[] args) {
        MyCalculator my_calculator = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("I implemented: " + my_calculator.getClass().getInterfaces()[0].getName());
        System.out.println(my_calculator.divisor_sum(n));
        sc.close();
    }
}
