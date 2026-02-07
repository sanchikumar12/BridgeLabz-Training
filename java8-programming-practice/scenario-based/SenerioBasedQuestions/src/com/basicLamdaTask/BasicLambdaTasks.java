package com.basicLamdaTask;
import java.util.*;
import java.util.function.*;

public class BasicLambdaTasks {

    public static void main(String[] args) {

        /* 1. Lambda to run a task in a separate thread */
        Runnable task = () -> System.out.println("Task running in a separate thread");
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("\n----------------------");

        /* 2. Lambda to print numbers from a list */
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        numbers.forEach(n -> System.out.println(n));

        System.out.println("\n----------------------");

        /* 3. Lambda to check if a number is even or odd */
        Predicate<Integer> isEven =
                n -> n % 2 == 0;

        numbers.forEach(n ->
            System.out.println(n + " is " + (isEven.test(n) ? "Even" : "Odd"))
        );

        System.out.println("\n----------------------");

        /* 4. Lambda to add two numbers */
        BiFunction<Integer, Integer, Integer> add =
                (a, b) -> a + b;

        System.out.println("Addition: " + add.apply(10, 20));

        System.out.println("\n----------------------");

        /* 5. Lambda to find greater of two numbers */
        BiFunction<Integer, Integer, Integer> greater =
                (a, b) -> a > b ? a : b;

        System.out.println("Greater number: " + greater.apply(15, 25));
    }
}

