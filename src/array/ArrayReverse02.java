package array;

public class ArrayReverse02 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}