import java.util.Scanner;

public class URI1133 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        for (int i = x + 1; i < y; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
    }
}
