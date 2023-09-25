import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        // new Scanner
        Scanner input = new Scanner(System.in);
        // input
        char c = input.next().charAt(0);
        // estimate
        switch (c) {
            case 'a', 'e', 'o', 'i', 'u' -> System.out.println(c);
            default -> System.out.println("²»ÊÇÔªÒô×ÖÄ¸");
        }
    }
}
