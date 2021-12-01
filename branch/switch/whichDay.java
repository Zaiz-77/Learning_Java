package PracticeDiary_1;

import java.util.Scanner;
public class code_5_3_whichDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请依次输入月和日（2021年）：");
        int month = scan.nextInt();
        int day = scan.nextInt();
        //利用击穿性，一旦到达case倒着往前把之前的月份全加上，然后再加上自己的day数，就可以得到天数
        //该方法比Python中更优越，个人觉得
        int count = 0;
        switch (month){
            case 12:
                count += 30;
            case 11:
                count += 31;
            case 10:
                count += 30;
            case 9:
                count += 31;
            case 8:
                count += 31;
            case 7:
                count += 30;
            case 6:
                count += 31;
            case 5:
                count += 30;
            case 4:
                count += 31;
            case 3:
                count += 28;
            case 2:
                count += 31;
            case 1:
                count += day;
        }
        //该问题可以继续升级为任何一年，其实就在此基础上加上闰年的判断即可，可被4不可被100，或者可被400整除就行
        System.out.println(month + "月" + day + "日" + "是第" + count + "天");
    }
}
