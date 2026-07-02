package com.builder;

public class TestBuilder {
    public static void main(String[] args) {
        Computer c1 = new Computer.Builder()
                .cpu("i9")
                .ram("32GB")
                .storage("1TB SSD")
                .gpu("RTX 4080")
                .build();
        Computer c2 = new Computer.Builder()
                .cpu("i5")
                .ram("8GB")
                .storage("512GB SSD")
                .build();
        c1.show();
        c2.show();
    }
}