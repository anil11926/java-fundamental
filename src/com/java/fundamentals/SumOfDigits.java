package com.java.fundamentals;

import java.util.Scanner;

public class SumOfDigits {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =scanner.nextInt();
        while (num >=10){
            int sum = 0;
            while (num > 0){
                sum = sum + num%10;
                num = num/10;
            }
            num = sum;
        }
        System.out.println(num);
    }
}
