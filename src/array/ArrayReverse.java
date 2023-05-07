package array;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        int[] arr2 = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[arr.length - i - 1];
        }
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + "\t");
        }
    }
}
