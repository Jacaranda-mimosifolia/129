import java.util.Arrays;

public class Exercise_21 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};
        int [] b = arrayCopy(a);
        System.out.println(Arrays.toString(b));
    }

    public static int [] arrayCopy(int [] a) {
        int [] b = a;
        return b;
    }
}
