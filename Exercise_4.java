import java.util.Scanner;
public class Exercise_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i = 0 ;i<a;i++){
            if(i * i == a){
                System.out.println("ƽ������"+i);
                break;
            }else if(i * i > a){
                System.out.println("ƽ�����ǣ�"+(i-1)+"������"+(a-(i-1)*(i-1)));
                break;
            }
        }
    }
}
