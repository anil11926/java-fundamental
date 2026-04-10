package com.java.fundamentals;

import java.util.Scanner;

public class EcommerceAppMenu {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Welcome to E-Commerce App");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Menu");
        System.out.println("1.Customer");
        System.out.println("2.Order");
        System.out.println("3.Product");
        System.out.println("4.Payment");
        System.out.println("5.Exit");
        System.out.println();
        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Welcome to Customer Section");
                System.out.println("1.Signup");
                System.out.println("2.Login");
                int customer = scanner.nextInt();
        }


    }
}
