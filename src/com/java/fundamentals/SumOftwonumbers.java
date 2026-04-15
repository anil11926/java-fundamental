package com.java.fundamentals;

import java.util.Scanner;

public class SumOftwonumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter First number");
        long firstNumber = sc.nextLong();
        System.out.println("enter Second number");
        long secondNumber = sc.nextLong();
        long result = firstNumber + secondNumber;
        System.out.println("Result: " + result);
        sc.close();


    }
}
