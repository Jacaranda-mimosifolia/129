import java.util.Arrays;
import java.util.Scanner;

public class Exercise_22 {
    public static void main(String[] args) {
        // 打分
        int [] a = new int[6];
        for (int i = 0; i < 6; i++) do a[i] = score(); while (a[i] == -1);
        System.out.println(Arrays.toString(a));
        // 计算
        int sum = 0;
        int max = a[0];
        int min = a[0];
        for (int j : a) {
            if (max < j) max = j;
            if (min > j) min = j;
        }
        for (int j : a) sum += j;
        sum = (sum-max-min)/4;
        System.out.println(sum);
    }

    public static int score() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a>=0 && a<=100) return a;
        else {System.out.println("您输入的分数不合法");return -1;}
    }
}
