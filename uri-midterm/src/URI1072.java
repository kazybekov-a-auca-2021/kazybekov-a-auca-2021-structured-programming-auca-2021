import java.util.Scanner;

public class URI1072 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), in = 0, out = 0;

        for (int i = 1; i <= n; i++) {
            int num = scan.nextInt();
            if (num >= 10 && num <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.printf("%d in\n%d out\n", in, out);
    }
}
