package com.ShoppingLambda;

import java.util.*;
import java.util.function.*;

public class ShoppingLambdaDemo {

    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " | Price: " + price;
        }
    }

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", 60000),
                new Product("Headphones", 2000),
                new Product("Mobile", 25000),
                new Product("Keyboard", 800)
        );

        /* 1. Lambda to apply 10% discount */
        Function<Product, Double> discount =
                p -> p.price * 0.90;

        /* Apply discount and print */
        products.forEach(p -> {
            double discountedPrice = discount.apply(p);
            System.out.println(p.name + 
                    " | Original: " + p.price + 
                    " | Discounted: " + discountedPrice);
        });
    }
}
