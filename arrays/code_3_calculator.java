package com.arrays;

import java.util.Scanner;

public class code_3_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的算式：");
        double a = scan.nextDouble();
        char c = scan.next().charAt(0);
        double b = scan.nextDouble();

        switch (c) {
            case '+':
                System.out.println(a + " + " + b + " = " + add(a, b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + minus(a, b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + multi(a, b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + division(a, b));
                break;
        }
        scan.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double multi(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }
}
