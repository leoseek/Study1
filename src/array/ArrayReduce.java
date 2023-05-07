package array;

import java.util.Scanner;

public class ArrayReduce {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 77, 88, 99};
        char result;
        do {
            int[] arr2 = new int[arr.length - 1];
            for(int i = 0; i < arr.length - 1; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println("是否继续缩减？ y/n");
            result = myscanner.next().charAt(0);
            if(arr.length == 0){
                System.out.println("仅剩一个元素，不可继续缩减！");
                break;
            }
            if (result == 'n') {
                break;
            }
        } while (true);
        System.out.println("已退出");
    }
}

