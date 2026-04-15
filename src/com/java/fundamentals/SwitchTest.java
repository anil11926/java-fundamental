package com.java.fundamentals;

import java.util.Scanner;

public class SwitchTest {
    static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter Day: ");
        int day = Scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }


    }
}
