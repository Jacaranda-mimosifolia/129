import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args){
        // Scanner
        Scanner input =new Scanner(System.in);
        // input
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        // month
        int [] Month_days = {31,28,31,30,31,30,31,31,30,31,30,31};
        // estimate
        if(year%4 == 0) Month_days[1] = 29;
        // variable
        int sum = 0;
        // arithmetic
        for (int i = 0; i < month-1; i++) sum+=Month_days[i];
        sum +=day;
        // printf
        System.out.printf("%d年%d月%d日，是这年的第%d天",year,month,day,sum);
    }
}
