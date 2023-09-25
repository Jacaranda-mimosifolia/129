import java.util.Random;

public class Exercise_26 {
    public static void main(String[] args) {
        int [] arr ={0,1,2,3,4,5,6,7,8,9};
        // 1.有效数组长度
        int arrLength = arr.length;
        // 2.抽出元素，数组长度-1
        for (int i = 0; i < arr.length; i++) arrLength = out(arr,arrLength);
    }

    public static int out(int [] arr,int arrLength) {
        Random r = new Random();
        int b = r.nextInt(arrLength);
        System.out.println(arr[b]);
        for(int i = b;i<arrLength;i++) if(i!=arrLength-1) arr[i] = arr[i+1];
        return --arrLength;
    }
}
