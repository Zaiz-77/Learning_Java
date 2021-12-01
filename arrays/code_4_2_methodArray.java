package com.arrays;

public class code_4_2_methodArray {
    public static void main(String[] args) {
        int[] numbers  = {1, 5, 6, 1, 9, 10, 41856, 14}; // 声明数组的时候，类型 + 数组名字
        travelArray(numbers);
        System.out.println();
        travelArray(reverseArray(numbers));
    }

    // 遍历数组
    public static void travelArray(int[] Array){ // 注意前面只是说明这个参数的类型是什么，只要还是形参得写上
        for (int i : Array) {
            System.out.print(i + " ");
        }
    }

    // 反转数组
    public static int[] reverseArray(int[] Array){
        int[] tempArray = new int[Array.length]; // 开辟了新空间 O(n)
        int k = Array.length - 1;
        for(int i = Array.length - 1; i >= 0; i--){
            tempArray[k - i] = Array[i];
        }
        return tempArray;
    }
}
