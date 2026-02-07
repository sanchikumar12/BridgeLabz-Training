package com.FinanceSystem;

import java.util.*;
import java.util.function.*;

public class BankingLambdaDemo {

    static class Account {
        int accountNumber;
        String holderName;
        double balance;

        Account(int accountNumber, String holderName, double balance) {
            this.accountNumber = accountNumber;
            this.holderName = holderName;
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "Account No: " + accountNumber +
                   " | Name: " + holderName +
                   " | Balance: " + balance;
        }
    }

    public static void main(String[] args) {

        Account acc1 = new Account(101, "Rahul", 12000);
        Account acc2 = new Account(102, "Anita", 8000);

        /* 1. Lambda to check minimum balance rule (min balance = 5000) */
        Predicate<Account> minBalanceCheck =
                acc -> acc.balance >= 5000;

        System.out.println("Min balance acc1: " + minBalanceCheck.test(acc1));
        System.out.println("Min balance acc2: " + minBalanceCheck.test(acc2));

        System.out.println("\n----------------------");

        /* 2. Lambda to calculate simple interest (P * R * T / 100) */
        TriFunction<Double, Double, Double, Double> simpleInterest =
                (p, r, t) -> (p * r * t) / 100;

        System.out.println("Simple Interest: " +
                simpleInterest.apply(10000.0, 5.0, 2.0));

        System.out.println("\n----------------------");

        /* 3. Lambda to validate withdrawal amount */
        BiPredicate<Account, Double> withdrawalValid =
                (acc, amount) -> amount > 0 && amount <= acc.balance;

        System.out.println("Withdraw 3000 from acc1: " +
                withdrawalValid.test(acc1, 3000.0));

        System.out.println("\n----------------------");

        /* 4. Lambda to print account details */
        Consumer<Account> printAccount =
                acc -> System.out.println(acc);

        printAccount.accept(acc1);
        printAccount.accept(acc2);

        System.out.println("\n----------------------");

        /* 5. Lambda to compare two account balances */
        Comparator<Account> balanceComparator =
                (a1, a2) -> Double.compare(a1.balance, a2.balance);

        int result = balanceComparator.compare(acc1, acc2);
        System.out.println("Balance comparison result: " + result);
    }

    /* Custom Functional Interface (Java doesn't have TriFunction) */
    @FunctionalInterface
    interface TriFunction<A, B, C, R> {
        R apply(A a, B b, C c);
    }
}
