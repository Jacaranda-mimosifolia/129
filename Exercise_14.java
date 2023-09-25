public class Exercise_14 {
    public static void main(String[] args) {
        int [] a = {1,5,4,3,2,8,9,6,4};
        int b = Compare(a);
        System.out.println(b);
    }

    public static int Compare(int [] a) {
        int max = a[0];
        // 1.ÈıÔªÔËËã·û
        for (int i = 1; i < a.length; i++) max = max>a[i]?max:a[i];
        // 2¡£Math.max
        for (int i = 1; i < a.length; i++)  max = Math.max(max, a[i]);
        // 3.if
        for (int i : a) if(max<a[i]) max = a[i];
        return max;
    }
}
