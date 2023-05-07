package HomeWork;

import java.util.Scanner;

public class YearsJudge {
    public static void main(String[] args) {
        int year = 0;
        Scanner years = new Scanner(System.in);
        System.out.println("请输入年份：");
        year = years.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
            System.out.println("是闰年");
        }else {
            System.out.println("不是闰年");
        }
    }
}
