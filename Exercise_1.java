import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args){
        // 判断是否为回文数，12321
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a;
        int sum = 0;
        while(a!=0){
            int c = a%10;
            a/=10;
            sum = sum*10 + c;
        }
        System.out.println(sum);
        System.out.println(a);
        System.out.println(b);
        System.out.println(b == sum);
    }
}
