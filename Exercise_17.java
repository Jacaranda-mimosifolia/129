import java.util.Objects;
import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variable
        double price;
        int month;
        String type;
        int a;

        // Estimate_Input
        do {
            // input
            price = input.nextDouble();
            month = input.nextInt();
            type = input.next();

            // estimate
            month = estimate(month);    // month == 2,false
            a = estimate(type);         // a == 2,false
        } while (month == 2 && a == 2);

        // discount
        double p = discount(price, month, a);
        System.out.println(p);
    }

    public static int estimate(int month) {
        if (5 <= month && month <= 10) month = 0;
        else if ((0 <= month && month <= 4) || (11 <= month && month <= 12)) month = 1;
        else {
            System.out.println("您出入的月份不合法");
            month = 2;
        }
        return month;
    }

    public static int estimate(String type) {
        int a = 0;
        if (Objects.equals(type,"经济舱")) a = 0;
        else if (Objects.equals(type,"头等舱")) a = 1;
        else {
            System.out.println("您输入的舱位不合法");
            a = 2;
        }
        return a;
    }

    public static double discount(double price, int month, int a) {
        if (month == 0) {
            if (a == 0) price *= 0.9;
            else price *= 8.5;
        } else if (month == 1) {
            if (a == 0) price *= 0.7;
            else price *= 0.65;
        }
        return price;
    }
}
