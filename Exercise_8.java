import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        // ���鳤��
        System.out.println("��ѡ�����鳤�ȣ�");
        int l = input.nextInt();
        // ��������ͱ���
        int [] arr = new int [l];
        int temp;
        // ���������
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(10);
            arr[i] = number;
        }
        System.out.println(Arrays.toString(arr));
//        // ����
//        if(l%2!=0) l -= 1;
//        l /= 2;
//        // �û�
//        for (int i = 0; i < l; i++) {
//            temp = arr[i];
//            arr[i] = arr[arr.length-1-i];  // arr.length:�ܳ���;arr.length-1:��������
//            arr[arr.length-1-i] = temp;
//        }
        // �Ż�
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
