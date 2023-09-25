import java.util.Arrays;
import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args){
        int [] a = new int [5];
        Input(a);
        Print(a);
    }

    public static void Input(int [] a){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) a[i] = input.nextInt();
    }

    public static void Print(int [] a){
        System.out.println(Arrays.toString(a));
    }
}
