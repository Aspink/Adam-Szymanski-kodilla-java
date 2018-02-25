package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // tu umieść kolejny test ->
        System.out.println("\nTest - pierwszy test jednostkowy:\n");
        int a = 2;
        int b = 3;
        int sum = Calculator.add(a,b);
        if (sum == a + b) {
            System.out.println("test sum OK");
        } else {
            System.out.println("Sum error!");
        }

        int sub = Calculator.substract(a,b);
        if (sub == a - b) {
            System.out.println("test substract OK");
        } else {
            System.out.println("Substract error!");
        }
    }
}
