package com.example.ppj04;

public class tusk {
    public static void main(String[] args) {
        //Integer numbers
        int num1 = 10;
        int num2 = 5;
        //Real numbers
        double d1 = 7.0;
        double d2 = 1.33;
        //Character values
        char c1 = 'a';
        char c2 = 'f';

        // Addition
        int sum = num1 + num2;
        double sum1 = d1 + d2;
        int sum2 = c1 + c2;
        System.out.println("Sum integer numbers: " + sum);
        System.out.println("Sum real numbers: " + sum1);
        System.out.printf("Sum character values: " + sum2);

        // Subtraction
        int diff = num1 - num2;
        double diff2 = d1 - d2;
        int diff3 = c1 - c2;
        System.out.println("Difference integer numbers: " + diff);
        System.out.println("Difference real numbers: " + diff2);
        System.out.println("Difference character values: " + diff3);

        // Multiplication
        int pr = num1 * num2;
        double pr2 = d1 * d2;
        int pr3 = c1 * c2;
        System.out.println("Product integer numbers: " + pr);
        System.out.println("Product real numbers: " + pr2);
        System.out.println("Product character values: " + pr3);

        // Division
        int quot = num1 / num2;
        double qout1 = d1 / d2;
        int qout2 = c1 / c2;
        System.out.println("Quotient integer numbers: " + quot);
        System.out.println("Quotient real numbers: " + qout1);
        System.out.println("Quotient character values: " + qout2);

        // Modulo
        int rem = num1 % num2;
        double rem2 = d1 % d2;
        int rem3 = c1 % c2;
        System.out.println("Remainder integer numbers: " + rem);
        System.out.println("Remainder real numbers: " + rem2);
        System.out.println("Remainder character values: " + rem3);
    }
}
