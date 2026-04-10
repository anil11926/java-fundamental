package com.java.fundamentals;

import java.util.Scanner;

public class LoanCalculation {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);


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
            return ;
        }// calculate interest amount
        interestAmount = loanAmount * interestPercentage /100;
        // final amount
        loanAfterInterest = loanAmount + interestAmount;
        emiformonth = loanAfterInterest / (time*12);
        System.out.println("interest amount: " + interestAmount);
        System.out.println("final amount: " + loanAfterInterest);
        System.out.println("emi for month: " + emiformonth);


    }
}
