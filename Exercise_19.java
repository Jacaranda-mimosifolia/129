import java.util.Random;

public class Exercise_19 {
    public static void main(String[] args) {
        char [] arr = new char [4];
        for (int i = 0; i < 4; i++) {
            char a = ran1();
            arr[i] = a;
            System.out.print(a);
        }
        int a=ran2();
        System.out.print(a);
    }

    public static char ran1() {
        Random r = new Random();
        char a = (char) (r.nextInt(26) + 97);
        int b = r.nextInt(2);
        if(b==0) a -= 32;
        return a;
    }
    public static int ran2() {
        Random r = new Random();
        return r.nextInt(10);
    }
}
