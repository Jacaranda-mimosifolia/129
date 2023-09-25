import java.util.Random;

public class Exercise_20 {
    public static void main(String[] args) {
        Random r = new Random();
        StringBuilder str = new StringBuilder();
        // 随机抽取数组下标
        char [] chr = new char[52];
        for (int i = 0; i < chr.length; i++) {
            if (i<=25) chr[i] = (char)('a'+i);   // 'a'
            else chr[i] = (char)('A' + i - 26);  // 'A'
        }
        //字母
        for (int i = 0; i < 4; i++) {
            int arrayIndex = r.nextInt(52);
            str.append(chr[arrayIndex]);
        }
        // 数字
        int a = r.nextInt(10);
        str.append(a);
        System.out.println(str);
    }
}