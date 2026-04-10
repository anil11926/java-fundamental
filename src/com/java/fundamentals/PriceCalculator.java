package com.java.fundamentals;

import java.util.Scanner;

public class PriceCalculator {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter Product price: ");
        int productPrice = scanner.nextInt();
        System.out.println("enter age: ");
        byte age = scanner.nextByte();

        System.out.println("enter membership: D(diamond) / G(gold) / S(silver) / B(bronze)");
        char memberShip = scanner.next().charAt(0);
        double discountPrice;
        double stateTax;
        double centralTax;
        double priceAfterDiscount;
        double finalPrice;
        double discountPercentage;
        if (memberShip == 'D')
            discountPercentage = 50;
        else if (memberShip == 'G') {
            discountPercentage = 20;
        } else if (memberShip == 'S') {
            discountPercentage = 15;
        } else if (memberShip == 'B') {
            discountPercentage = 10;
        }else
            discountPercentage = 0;
        if (age > 65)
            discountPercentage += 10;
        else if (age <= 65 && age > 45) {
            discountPercentage += 8;
        } else if (age <= 45 && age >=25 ) {
            discountPercentage += 5;
        }
        discountPrice = productPrice * discountPercentage/100;
        priceAfterDiscount = productPrice - discountPrice;
        centralTax = priceAfterDiscount * 2.5/100;
        stateTax = priceAfterDiscount * 2.5/100;
        System.out.println("price after discount: " + priceAfterDiscount);
        finalPrice = stateTax + centralTax + priceAfterDiscount;
        System.out.println("product price: " + productPrice);
        System.out.println("age: " + age);
        System.out.println("discount price: " + discountPrice);
        System.out.println("price after Discount: "+ priceAfterDiscount);
        System.out.println("central tax: " + centralTax);
        System.out.println("state tax: " + stateTax);
        System.out.println("final price: " + finalPrice);
        scanner.close();



        // loan calculation for emi


        System.out.println("enter Loan Amount: ");
        int loanAmount = scanner.nextInt();
        System.out.println("enter time (in years): 5 / 8 /10 ");
        byte time = scanner.nextByte();
        double interestPercentage;
        double interestAmount;
        double loanAfterInterest;
        double emiformonth;

        if (time == 5) {
            interestPercentage = 8;
        }else if (time == 8) {
            interestPercentage = 10;
        } else if (time == 10) {
            interestPercentage = 12;
        }else {
            System.out.println("enter valid time: ");
            return;
        }// calculate interest amount
        interestAmount = loanAmount * interestPercentage /100;
        // final amount
        loanAfterInterest = loanAmount + interestAmount;
        emiformonth = loanAfterInterest / time * 12;
        System.out.println("intrest amount: " + interestAmount);
        System.out.println("final amount: " + loanAfterInterest);
        System.out.println("emi for month: " + emiformonth);







    }
}
