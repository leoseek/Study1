package array;

public class Array03 {
    public static void main(String[] args) {
        char i[] = new char[26];
        char k = 'A';
        for (int j = 0; j <= 25; j++){
            i[j] = k;
            k++;
            System.out.println(i[j]);
        }
    }
}
