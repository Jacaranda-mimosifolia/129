import java.util.Arrays;
import java.util.Scanner;

public class Exercise_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        // 1.������������
        int b = a;
        int l = 0;
        while (b != 0) {
            b /= 10;
            l++;
        }
        System.out.println(l);
        // 2.��������
        int[] arr = new int[l];
        for (int i = arr.length-1; i >= 0; i--) {
            arr[i] = a % 10;
            a /= 10;
        }
        System.out.println(Arrays.toString(arr));
        // 3.��ת
//        int temp;
//        for (int i = 0,j = arr.length-1; i < j; i++,j--) {
//            temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
