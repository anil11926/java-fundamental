package com.java.fundamentals;

import java.util.Scanner;

public class CountOfDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int count = 0;
        if (number == 0){
            count = 1;
        }else {
            while (number > 0){
                number = number / 10;
                count++;
            }
        }
        System.out.println("Number of Digits:" + count);
        sc.close();
    }
}


class Practice{
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
            int sum1 = 0;
            int digit;
            while (num1>0){
                digit = num1 % 10;
                sum1 = sum1 + digit;
                num1 = num1/10;

        }
        System.out.println(sum1);

    }
}
