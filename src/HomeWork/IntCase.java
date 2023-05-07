package HomeWork;

import java.util.Scanner;

public class IntCase {
    public static void main(String[] args) {
        int number = 0;
        Scanner i = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        number = i.nextInt();
        if(number > 0){
            System.out.println("大于0");
        } else if (number == 0) {
            System.out.println("等于0");
        } else if (number < 0) {
            System.out.println("小于0");
        }
    }
}
