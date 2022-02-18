package com.test.scaler.functionalInterface;


import java.util.function.BiFunction;

public class TestFunctionalInterface {

    int a = 2, b = 3;

    public static void main(String[] args) {
        TestAdd te = (a, b) -> a + b;
        System.out.println(te.add(1, 2));

        //Pom.xml -->Starter
    }
}
