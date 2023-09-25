import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        // 数组长度
        System.out.println("请选择数组长度：");
        int l = input.nextInt();
        // 定义数组和变量
        int [] arr = new int [l];
        int temp;
        // 填入随机数
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(10);
            arr[i] = number;
        }
        System.out.println(Arrays.toString(arr));
//        // 次数
//        if(l%2!=0) l -= 1;
//        l /= 2;
//        // 置换
//        for (int i = 0; i < l; i++) {
//            temp = arr[i];
//            arr[i] = arr[arr.length-1-i];  // arr.length:总长度;arr.length-1:最大的索引
//            arr[arr.length-1-i] = temp;
//        }
        // 优化
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
