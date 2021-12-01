package PracticeDiary_1;
/*
for 循环的结构：
for(初始化条件;循环条件;迭代条件){
    循环体
}
只要求了循环条件一定要是布尔类型，其他不做要求
注意中间是分号连接，每一个分号是一个部分，严格抓住这一点
初始化是标志该循环的起点，中间的过程和初始化没有关系了
条件->循环体->迭代
 */
public class code_6_0_loopFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i += 2){
            System.out.println(i);
        }
    }
}
