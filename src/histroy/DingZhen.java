package histroy;

import java.util.Scanner;

public class DingZhen {
    public static void main(String[] args) {
        Scanner  mypwd = new Scanner(System.in);
        String name = "";
        String passwd = "";
        int chance = 3;
        for(int i = 1; i <= 3; i++){
            System.out.println("请输入名字");
            name  = mypwd.next();
            System.out.println("请输入密码");
            passwd = mypwd.next();
            if(name.equals("丁真") && passwd.equals("666")){
                System.out.println("登陆成功");
                break;
            }else{
                System.out.println("用户名及密码不正确，请重试,还剩下" + (chance-1) + "机会");
                chance --;
                    if(chance == 0){
                        System.out.println("重试次数达上限！请稍后重试");
                        break;
                    }
            }
        }
    }
}
