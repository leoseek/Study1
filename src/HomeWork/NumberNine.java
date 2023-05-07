package HomeWork;

public class NumberNine {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 9 == 0){
                count ++;
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
