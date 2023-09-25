import java.util.Scanner;
public class Exercise_5 {
    public static void main(String[] args){
        // 素数
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        // 标记
        boolean flag = true;
        for(int i = 2;i<=Math.sqrt(a);i++)
            if(a!=i && a%i ==0){
                flag = false;
                break;
            }
        if(flag) System.out.println(a+"是素数");
        else System.out.println(a+"不是素数");
    }
}
