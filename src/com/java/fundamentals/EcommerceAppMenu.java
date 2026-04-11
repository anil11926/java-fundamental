package com.java.fundamentals;

import java.util.Scanner;

public class EcommerceAppMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("Welcome to E-Commerce App");
        System.out.println("--------------------------------------------------");
        System.out.println("Menu");
        System.out.println("1.Customer");
        System.out.println("2.Order");
        System.out.println("3.Product");
        System.out.println("4.Payment");
        System.out.println("5.Exit");
        System.out.println("Enter your input 1-5");
        int mainMenu = scanner.nextInt();
        switch (mainMenu) {
            case 1:
                System.out.println("Welcome to Customer Section");
                System.out.println("1.Signup");
                System.out.println("2.Login");
                System.out.println("enter your input 1 or 2");
                int customerMenu = scanner.nextInt();
                switch (customerMenu) {
                    case 1:
                        System.out.println("Customer signup Succsfully");
                        break;
                    case 2:
                        System.out.println("Customer loggedin Succsfully ");
                        break;
                }
                break;
            case 2:
                System.out.println("Welcome to Order Section");
                System.out.println("1.New order");
                System.out.println("2.Existing Order");
                System.out.println("enter your inputs ( 1 or 2)");
                int orderMenu = scanner.nextInt();
                switch (orderMenu) {
                    case 1:
                        System.out.println("New order placed successfully");
                        break;
                    case 2:
                        System.out.println("Existing order processed successfully");
                        break;
                }
                break;
            case 3:
                System.out.println("Welcome to product Section");
                System.out.println("1.Buy the Product ");
                System.out.println("2.Add product to cart");
                System.out.println("enter your inputs (1 or 2)");
                int productMenu = scanner.nextInt();
                switch (productMenu) {
                    case 1:
                        System.out.println("You Bought the product Successfully");
                        break;
                    case 2:
                        System.out.println("Product added to cart Successfully");
                        break;
                }
                break;
            case 4:
                System.out.println("Welcome to Payment Section");
                System.out.println("1.UPI payment");
                System.out.println("2.Crard Payments");
                System.out.println("enter your inputs (1 or 2)");
                int paymentMenu = scanner.nextInt();
                switch (paymentMenu) {
                    case 1:
                        System.out.println("UPI payment done Successfully");
                        break;
                    case 2:
                        System.out.println("Card Payment done Successfully");
                        break;

                }
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("invalid option");

        }
    }

}
