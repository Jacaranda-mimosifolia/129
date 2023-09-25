import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise_9 {
    public static void main(String[] args){
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("请选择数组长度：");
        int l = input.nextInt();
        int [] array = new int [l];
        int temp;
        int number;
        for (int i = 0; i < array.length; i++) {
            number = r.nextInt(10);
            array[i] = number;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            do{
                number = r.nextInt(10);
            }while(number==i);
            temp = array[i];
            array[i] = array[number];
            array[number] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
