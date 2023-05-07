package array;

public class array01 {
    public static void main(String[] args) {
        double[] hens = {3, 5, 1, 3.4, 2, 50};
        double totalweight = 0;
        for(int i = 0; i < hens.length; i++){
            System.out.println("第x个元素的值=" + hens[i]);
            totalweight += hens[i];
        }
        System.out.println(totalweight / 6);

    }
}
