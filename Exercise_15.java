import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] a = {6,4,8,1,3,2};
        int b = input.nextInt();
        System.out.println(Find(a,b));

    }

    public static int Find(int [] a,int b) {
        for (int j : a)
            if(b == j) {
                System.out.println("´æÔÚ");
                return b;
            }
        System.out.println("²»´æÔÚ");
        return b;
    }
}
