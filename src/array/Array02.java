package array;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
     //  double scores[] = new double[5];
        double scores[];
        scores = new double[5];

        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++){
            System.out.println("请输入成绩:" );
            scores[i] = myScanner.nextDouble();
        }
        System.out.println("数组元素情况如下");
        for (int i = 0; i< scores.length; i++){
            System.out.println("元素为:" + scores[i]);
        }
    }
}
