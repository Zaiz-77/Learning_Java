package PracticeDiary_1;

import java.util.Scanner;

public class code_5_2_season {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入月份：");
        int month = scan.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("春天");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏天");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋天");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬天");

        }
    }
}
