package HomeWork;

import java.util.Scanner;

public class ifElseDemo {
    public static void main(String[] args) {
        Scanner months = new Scanner(System.in);
        int month ;
        int age ;

        double money = 60;
        System.out.println("欢迎来到乐园，请输入您想要游玩的月份");
        month = months.nextInt();
        System.out.println("欢迎来到乐园，请输入您的年龄");
        age = months.nextInt();

        if(month >=4 && month<=10){
            if(age < 18){
                System.out.println("票价为:" + money/2 + "元");
            }else if(age >= 18 && age <= 60){
                System.out.println("票价为:" + money + "元");
            }else{
                System.out.println("票价为:" + money/3 + "元");
            }
        }else{
            if(age >= 18 && age <= 60){
                System.out.println("票价为:" + 40 + "元");
            }else{
                System.out.println("票价为:" + 20 + "元");
            }
        }
    }
}
