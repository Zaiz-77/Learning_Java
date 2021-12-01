package com.arrays;

public class code_4_1_array {
    public static void main(String[] args) {
        int [] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i + 1;
        }

        // 打印数组中的所有元素
        for(int x:numbers){
            System.out.print(x + "\t");
        }
        System.out.println();

        // 计算所有元素的和
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("全部元素的总和是：" + sum);

        // 查找最大元素
        int maxOne = numbers[0];
        for(int number:numbers){
            maxOne = (number > maxOne)?number:numbers[0];
        }
        System.out.println("最大元素是：" + maxOne);
    }
}
