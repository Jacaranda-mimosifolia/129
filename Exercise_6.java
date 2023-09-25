import java.util.Random;
import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args){
        Random r = new Random();
        // 生成一个1~100的数；
        int a = r.nextInt(100)+1;  // (0~99)+1=1~100
        // 猜数字
        System.out.println("请输入你所猜的数字");
        Scanner input = new Scanner(System.in);
        // 判断大小
        while (true){
            int b = input.nextInt();  // 用户输入所猜测数字
            if(b == a){
                System.out.println("您猜对了，真牛逼！！");
                break;
            }
            else if(b>a) System.out.println("菜狗，大了");
            else System.out.println("菜狗，小了");
        }
    }
}
