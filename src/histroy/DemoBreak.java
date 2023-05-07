package histroy;

public class DemoBreak {
    public static void main(String[] args) {
        int i;
        for (i = 1; ;i++) {
            int random = (int) (Math.random() * 100) + 1;
            if (random == 97) {
                break;
            }
        }
            System.out.println("生成97用了:" + i + "次");
    }
}
