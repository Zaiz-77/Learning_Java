package com.arrays;

import java.util.Arrays;

public class code_5_Arrays {
    public static void main(String[] args) {
        int[]  numbers = {1,41856,161,312,58,186,321,123};
        // 数组遍历
        System.out.println(Arrays.toString(numbers));

        // 排序数组,返回值为空,注意判断函数类型
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // 数组填充 fill(数组，值)
        Arrays.fill(numbers, 2, 4,  0);
        System.out.println(Arrays.toString(numbers));
    }
}
