package histroy;

public class DemoDoWhile {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            i++;
           sum += i ;
        }while(i <= 100);
        System.out.println(sum);

        int j = 1;
        int count = 0;
        do {
            if(j % 5 == 0 && j % 3 != 0)
              count++;
            System.out.println(j);
            j++;
        }while(j <= 200);
        System.out.println(count);
    }
}
