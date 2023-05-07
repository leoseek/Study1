package HomeWork;

public class additonDemo {
    public static void main(String[] args) {
        //     int i = 1;
        int sum = 0;
        int d = 1;
        for (int i = 1; i <= 100; i++) {
      //      sum += 1 + (i - 1) * 2;
             for (int j = 1; j<= i; j++)
               sum += j;
        }
        System.out.println(sum);
    }
}

