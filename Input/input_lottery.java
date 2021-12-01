package PracticeDiary_1;

import java.util.Scanner;

public class code_4_2_lottery {
    public static void main(String[] args) {
        int key = (int) (Math.random() * 90 + 10);

        Scanner scan = new Scanner(System.in);
        System.out.print("Please input your answer:");
        int yours = scan.nextInt();
        // 可以先把十位和个位计算出来再比较，没必要放到if结构里面，让代码看起来冗杂
        if (key == yours) {
            System.out.println("You get a prize of $10000!");
        } else if ((key / 10) == (yours % 10) && (key % 10) == (yours / 10)) {
            System.out.println("You get a prize of $3000!");
        } else if ((key / 10) == (yours / 10) || (key % 10) == (yours % 10)) {
            System.out.println("You get a prize of $1000");
        } else if ((key / 10) == (yours % 10) || (key % 10) == (yours / 10)) {
            System.out.println("You get a prize of $500");
        } else {
            System.out.println("You get nothing!");
        }
    }
}
