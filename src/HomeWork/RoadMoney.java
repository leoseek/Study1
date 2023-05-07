package HomeWork;

public class RoadMoney {
    public static void main(String[] args) {
        double cash = 100000;
        int times = 0;

        while(cash > 50000){
            cash *= 0.95;
            times ++;
            if(cash <= 50000){
                break;
                }
            }
        while(cash > 1000){
            cash -= 1000;
            times ++;
            }
        System.out.println("一共可以通过" + times + "次路口," + "还剩" + cash + "钱");
        }
    }

