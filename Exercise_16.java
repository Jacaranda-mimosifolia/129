import java.util.Arrays;

public class Exercise_16 {
    public static void main(String[] args) {
        int [] a = {4,2,4,7,8,1,4,5};
        int from = 2;
        int to = 6;
        int [] b = copyOfRange(a,from,to);
        System.out.println(Arrays.toString(b));
    }

    public static int[] copyOfRange(int [] a,int from,int to) {
        int j = 0;
        int [] b = new int[to-from];
        for (int i = from; i < to; i++) {
            b[j] = a[i];j++;
        }
        return b;
    }
}
