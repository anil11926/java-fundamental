package com.java.fundamentals;

public class Operators {
    static void main() {
        byte no1 = 100;
        byte no2;
        no2 = no1;
        System.out.println(no2);
        int res = 10 + 20 - 30 * 40 / 50 % 60;
        System.out.println(res);


        System.out.println("=====================================================================================================");

        int num1 = 342342342;
        int num2 = 788624165;
        long sum = num1 + num2;
        System.out.println(sum);

        byte b1 = 127;
        byte b2 = 127;
        short res1 = (short) (b1 + b2);
        System.out.println(res);

        num1 = 10;
        num2 = 20;
        res = --num1 + ++num1 + num1-- + num1++ - --num2 + ++num2;
        System.out.println(res);
        System.out.println(num1);
        System.out.println(num2);

        System.out.println("*****************************************************************************");


        num1 = 32;
        num2 = 65;
        System.out.println( num1++ > num2 && num1 < num2 );





    }
}
