package com.java.fundamentals;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // alt+ctrl+v for variable
        System.out.println("enter age :");
        byte age = scanner.nextByte();
        System.out.println("age: " + age);

        System.out.println("enter marks:");
        short marks = scanner.nextShort();
        System.out.println("marks: " + marks);

        System.out.println("enter salary");
        int salary = scanner.nextInt();
        System.out.println("salary: " + salary);

        System.out.println("enter phone number:");
        long phoneNumber = scanner.nextLong();
        System.out.println("Phone number: " + phoneNumber);

        System.out.println("enter Gender:");
        char gender = scanner.next().charAt(0);
        System.out.println("gender: " + gender);

        System.out.println("enter discount");
        float discount = scanner.nextFloat();
        System.out.println("discount: " + discount);

        System.out.println("enter average marks");
        double averageMarks = scanner.nextDouble();
        System.out.println("average marks : " + averageMarks);

        System.out.println("enter is stock Available: Ture/false");
        boolean isStockAvailable = scanner.nextBoolean();
        System.out.println("is stock Available: " + isStockAvailable);


    }
}
