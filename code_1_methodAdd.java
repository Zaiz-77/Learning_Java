package com.arrays;

import java.util.Scanner;

public class code_1_methodAdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入a，b");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(add(a, b));

        scan.close();
    }
    public static int add(int a, int b){
        return a + b;
    }
}
