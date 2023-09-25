import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        // new Scanner
        Scanner input = new Scanner(System.in);
        // input:height,weight
        double height = input.nextDouble();
        double weight = input.nextDouble();
        // estimate
        if (height > 2.5 || weight > 150) System.out.print("输入数据不符合实际，请重新输入");
        // String
        String temp;
        // Arithmetic
        double BMI = weight / Math.pow(height, 2);
        // function
        if (BMI < 18.5) temp = "过轻";
        else if (18.5 <= BMI && BMI < 24) temp = "正常";
        else if (24 <= BMI && BMI < 27) temp = "过重";
        else if (27 <= BMI && BMI < 30) temp = "轻度肥胖";
        else if (30 <= BMI && BMI < 35) temp = "中度肥胖";
        else temp = "重度肥胖";
        System.out.printf("您的BMI是:%.3f,%s", BMI, temp);
    }
}
