package com.SystemUtil;

import java.util.*;

/* Seller */
class Seller {
    String name;

    Seller(String name) {
        this.name = name;
    }

    Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}

/* Delivery Partner */
class DeliveryPartner {
    String company;

    DeliveryPartner(String company) {
        this.company = company;
    }

    Optional<String> getCompany() {
        return Optional.ofNullable(company);
    }
}

/* Product */
class Product {
    String name;
    Double price;
    Double discount;          // may be null
    String couponCode;        // may be null
    String description;       // may be null
    Seller seller;
    DeliveryPartner deliveryPartner;

    Product(String name, Double price, Double discount,
            String couponCode, String description,
            Seller seller, DeliveryPartner deliveryPartner) {

        this.name = name;
        this.price = price;
        this.discount = discount;
        this.couponCode = couponCode;
        this.description = description;
        this.seller = seller;
        this.deliveryPartner = deliveryPartner;
    }

    Optional<Double> getDiscount() {
        return Optional.ofNullable(discount);
    }

    Optional<String> getCouponCode() {
        return Optional.ofNullable(couponCode);
    }

    Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    Optional<Seller> getSeller() {
        return Optional.ofNullable(seller);
    }

    Optional<DeliveryPartner> getDeliveryPartner() {
        return Optional.ofNullable(deliveryPartner);
    }
}

public class ECommerceSystem {

    private static final double DEFAULT_DISCOUNT = 0.05; // 5%

    public static void main(String[] args) {

        Product product = new Product(
                "Smart Watch",
                5000.0,
                null,
                null,
                null,
                new Seller("TechStore"),
                new DeliveryPartner("BlueDart")
        );

        /* 1. Apply default discount if missing */
        double discount = product.getDiscount().orElse(DEFAULT_DISCOUNT);
        double finalPrice = product.price - (product.price * discount);
        System.out.println("Final Price: " + finalPrice);

        /* 2. Fetch coupon code if present */
        product.getCouponCode()
                .ifPresent(code ->
                        System.out.println("Coupon Applied: " + code)
                );

        /* 3. Display seller details safely */
        String sellerName = product.getSeller()
                .flatMap(Seller::getName)
                .orElse("Seller not available");
        System.out.println("Seller: " + sellerName);

        /* 4. Product description fallback */
        String description = product.getDescription()
                .orElse("No description available");
        System.out.println("Description: " + description);

        /* 5. Fetch delivery partner info */
        product.getDeliveryPartner()
                .flatMap(DeliveryPartner::getCompany)
                .ifPresent(company ->
                        System.out.println("Delivery Partner: " + company)
                );
    }
}
