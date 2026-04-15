package com.java.fundamentals;

public class Primitives {
    static void main() {
        //Primitives
        //byte
        // stores 1 byte of memory
        //range : -128 to 127
        byte age;
        byte subject1Marks, subject2Marks, subject3Marks, subject4Marks, subject5Marks;
        age = 22;
        System.out.println("Age: " + age);
        subject1Marks = 95;
        subject2Marks = 92;
        subject3Marks = 89;
        subject4Marks = 96;
        subject5Marks = 87;
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("subject1Marks: " + subject1Marks + ", subject2Marks: " + subject2Marks + ", subject3Marks: " + subject3Marks + ",subject4Marks: " + subject4Marks + ", subject5Marks: " + subject5Marks);
        System.out.println("------------------------------------------------------------------");

        // short = 2 bytes
        // range =
        // total marks

        short totalMarks = 459;
        System.out.println("Total Marks; " + totalMarks);
        System.out.println("----------------------------------------------");


        //manufacturing year, days in expiry

        short manufacturingYear = 2025;
        short daysInExpiry = 170;
        System.out.println("manufacturing Year: " + manufacturingYear + ", days In Expiry: " + daysInExpiry);

        // int
        // integer = 4 bytes
        //range =
        //the variables comes under integer
        // salary, otp, prices,

        int salaryInLakhs = 1200000;
        int otp = 882266;
        int laptopPrice = 85000;
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Salary In Lakhs: " + salaryInLakhs );
        System.out.println("OTP: " + otp);
        System.out.println("Laptop Price " + laptopPrice);

        // long
        // have to add L at end of variable
        // example: aahaar , mobile number, population

        long aadhaarNumber = 458628915634L;
        long mobileNumber = 8882226667L;
        long populationOfIndia = 1400000000L;
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Aadhaar Number: " + aadhaarNumber);
        System.out.println("Mobile Number:" + mobileNumber);
        System.out.println("Population Of India" + populationOfIndia);



    }
}
