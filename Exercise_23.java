import java.util.Arrays;
import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) {
        // 1.��ȡ���飬ԭ����
        int [] a = arrInput();
        System.out.println(Arrays.toString(a));
        // 2.ÿһλ������5
        arrAdd(a);
        System.out.println(Arrays.toString(a));
        // 3.��10ȡ����
        arrRemained(a);
        System.out.println(Arrays.toString(a));
        // 4.��ת
        arrReversal(a);
        System.out.println(Arrays.toString(a));
    }
    public static int [] arrInput(){
        Scanner input = new Scanner(System.in);
        int [] a = new int[6];
        for (int i = 0; i < a.length; i++) a[i] = input.nextInt();
        return a;
    }

    public static void arrAdd(int [] a){for (int i = 0; i < a.length; i++) a[i] += 5;}

    public static void arrRemained(int [] a){for (int i = 0; i < a.length; i++) a[i] %= 10;}

    public static void arrReversal(int [] a){
        int temp;
        for (int i=0,j=a.length-1;i<j;i++,j--) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
