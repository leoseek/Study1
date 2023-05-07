package HomeWork;

public class Waterflowers {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int  j = i % 10;
            int  k = i / 10 % 10;
            int  l = i / 100;

            if (j * j * j + k * k * k + l * l * l == i) {
                System.out.println(i);
            }
        }
    }
}