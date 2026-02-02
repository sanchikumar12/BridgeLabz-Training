package com.Collectors;

import java.util.*;
import java.util.stream.*;

class Order {
    String customerName;
    double orderTotal;

    Order(String customerName, double orderTotal) {
        this.customerName = customerName;
        this.orderTotal = orderTotal;
    }
}

public class OrderRevenueSummary {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
            new Order("Alice", 1200.50),
            new Order("Bob", 850.00),
            new Order("Alice", 430.75),
            new Order("Charlie", 2100.00),
            new Order("Bob", 399.99)
        );

        Map<String, Double> revenuePerCustomer =
            orders.stream()
                  .collect(Collectors.groupingBy(
                      o -> o.customerName,
                      Collectors.summingDouble(o -> o.orderTotal)
                  ));

        revenuePerCustomer.forEach((customer, total) ->
            System.out.println(customer + " Total Revenue: " + total)
        );
    }
}
