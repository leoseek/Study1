package histroy;

import java.util.Scanner;

public class DemoDoWhileinput {
    public static void main(String[] args) {
       Scanner result =  new Scanner(System.in);
       char answer = ' ';
       do{
           System.out.println("还钱吗？y/n");
            answer = result.next().charAt(0);
       }while(answer != 'y');
    }
}
