import java.util.Scanner;

public class URI1099 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scan.nextInt(), b = scan.nextInt();
            int sum = 0;
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (a == b) {
                System.out.println(0);
            } else {
                for (int j = a + 1; j < b; j++) {
                    if (j % 2 != 0) {
                        sum += j;
                    }
                }
                System.out.println(sum);
            }
        }
    }
}
