package PracticeDiary_1;
//综合训练
//一直输入直到输入0，并统计正数和负数的个数
import java.util.Scanner;
public class code_7_1_loopCom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countPos = 0;
        int countNeg = 0;
        boolean flag = true;

        while (flag) {
            int i = scan.nextInt();
            if (i > 0) {
                countPos += 1;
            } else if (i < 0) {
                countNeg += 1;
            } else {
                flag = false;
            }
        }
        System.out.println(countPos);
        System.out.println(countNeg);
    }
}
