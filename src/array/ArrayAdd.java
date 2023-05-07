package array;

import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Scanner myscanner = new Scanner(System.in);
        char result;
        do {
            int[] arr2 = new int[arr.length + 1];
            for(int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            System.out.println("请输入元素的值:");
            int value = myscanner.nextInt();
            arr2[arr2.length - 1] = value;
            arr = arr2;
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println("是否需要添加元素？ y/n");
            result = myscanner.next().charAt(0);
            if (result == 'n') {
                break;
            }
        } while (true);
        System.out.println("已退出");
    }
}

