import java.util.Random;
import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args){
        Random r = new Random();
        // ����һ��1~100������
        int a = r.nextInt(100)+1;  // (0~99)+1=1~100
        // ������
        System.out.println("�����������µ�����");
        Scanner input = new Scanner(System.in);
        // �жϴ�С
        while (true){
            int b = input.nextInt();  // �û��������²�����
            if(b == a){
                System.out.println("���¶��ˣ���ţ�ƣ���");
                break;
            }
            else if(b>a) System.out.println("�˹�������");
            else System.out.println("�˹���С��");
        }
    }
}
