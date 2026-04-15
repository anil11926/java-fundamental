package com.java.fundamentals;

import java.util.Scanner;

public class LoopTest {
    static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; System.out.println(++i)){
            i += 3;
        }
    }
}
     // loop test 1
 class LoopTest1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range");
        int range = sc.nextInt();
        int number = 1;
        while(number <= range) {
            System.out.println(number);
            number++;
        }
    }
}
// print numbers from n to 1
class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        for (int i = number; i >= 1; i--) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}