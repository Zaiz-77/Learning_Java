package PracticeDiary_1;
/*
1.导入包：import java.util.Scanner; 这个包就是用来输入的,而提示你输入什么东西，是out出去的，不能像Python一样提示你
2.类的实例化,也就是定义一个新的scan就可，随便命名，但是要见名知义
3.调用相关方法来获取指定类型的变量
*/

import java.util.Scanner;

public class code_4_0_input {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //nextInt是整型数字
        //next是字符串
        //nextDouble或者nextFloat是浮点数
        //nextBoolean是布尔类型

        //而对于char类型地获取，scanner并没有对应的方法，我们是用next()即可。
        //charAt可以获取对应下标的东西，类似于Python中的index


        // 然后用result来接收,要按照类型要求来给定值，比如int你不能输入一个double
        // 后者意思：从键盘获取一个int类型的数值
        System.out.print("请输入您的成绩：");
        int result = scan.nextInt();
        if (result < 60) {
            System.out.println("D");
        } else if (result < 80) {
            System.out.println("B");
        } else if (result < 90) {
            System.out.println("A");
        } else {
            System.out.println("A+");
        }
    }
}
