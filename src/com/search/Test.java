package com.search;

public class Test {

    public static void main(String[] args) {

        Product[] products = {
            new Product(1, "Shoes", "Fashion"),
            new Product(2, "Laptop", "Electronics"),
            new Product(3, "Phone", "Electronics"),
            new Product(4, "Watch", "Accessories")
        };

        // Linear Search
        Product result1 = LinearSearch.search(products, "Phone");
        System.out.println("Linear Search Result: " + result1);

        // Binary Search (must sort first)
        BinarySearch.sortProducts(products);
        Product result2 = BinarySearch.search(products, "Phone");
        System.out.println("Binary Search Result: " + result2);
    }
}