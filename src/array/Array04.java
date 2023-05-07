package array;

public class Array04 {
    public static void main(String[] args) {
        
        int[] i = {4, -1, 9, 10, 23, 110, -23, 56, 888, 256};
        int max = 0;
        for (int j = 0; j < i.length - 1; j++) {
            if (i[j] > i[j + 1]) {
                max = i[j];
            } else {
                max = i[j + 1];
            }
        }
        System.out.println(max);
        for (int k = 0; k < i.length; k++)
            if (i[k] == max) {
                System.out.println(k);
            }
    }
}
