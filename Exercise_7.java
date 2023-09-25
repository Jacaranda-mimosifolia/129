import java.util.Arrays;
import java.util.Random;
public class Exercise_7 {
    public static void main(String[] args){
        Random r = new Random();
        int sum = 0;
        int average = 0;
        int count = 0;
        int [] array = new int[10];
        for (int i = 0; i < 10; i++) {
            int a = r.nextInt(100)+1;
            sum += a;
            array[i] = a;
        }
        average = sum/10;
        for (int i = 0; i < 10; i++) {
            if(array[i]<average) count++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);
        System.out.println(average);
        System.out.println(count);
    }
}
