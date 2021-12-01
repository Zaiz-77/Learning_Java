package com.arrays;

import java.util.Scanner;

public class code_2_methodCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入a，b");

        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(compare(a, b));

        scan.close();
    }

    public static String compare(int a, int b) {
        if (a > b) {
            return "a大于b";
        } else {
            return "a不大于b";
        }
    }
}