import java.util.Scanner;

public class URI1132 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        int sum = 0;

        for (int i = x; i <= y; i++) {
            if (i % 13 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
