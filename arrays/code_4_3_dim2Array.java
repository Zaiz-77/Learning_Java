package com.arrays;

public class code_4_3_dim2Array {
    public static void main(String[] args) {
        // 声明二维数组
        int[][] matrix = {{10,21,35,47}, {51,68,89,91}, {10,15,16,78}}; // 这样就定义了一个三行四列的数组
        traverMatrix(matrix);
    }

    //遍历二维数组
    public static void traverMatrix(int[][] matrix){
        for(int[] row: matrix){
            code_4_2_methodArray.travelArray(row);
            System.out.println();
        }
    }
}
