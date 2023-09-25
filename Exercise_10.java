import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        // new Scanner
        Scanner input = new Scanner(System.in);
        // input:height,weight
        double height = input.nextDouble();
        double weight = input.nextDouble();
        // estimate
        if (height > 2.5 || weight > 150) System.out.print("�������ݲ�����ʵ�ʣ�����������");
        // String
        String temp;
        // Arithmetic
        double BMI = weight / Math.pow(height, 2);
        // function
        if (BMI < 18.5) temp = "����";
        else if (18.5 <= BMI && BMI < 24) temp = "����";
        else if (24 <= BMI && BMI < 27) temp = "����";
        else if (27 <= BMI && BMI < 30) temp = "��ȷ���";
        else if (30 <= BMI && BMI < 35) temp = "�жȷ���";
        else temp = "�ضȷ���";
        System.out.printf("����BMI��:%.3f,%s", BMI, temp);
    }
}
