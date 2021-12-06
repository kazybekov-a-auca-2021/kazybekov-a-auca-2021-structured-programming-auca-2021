import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A = ");
        int a = scan.nextInt();

        System.out.print("B = ");
        int b = scan.nextInt();

        System.out.printf("GCD(%d, %d) = %d", a, b, gcd(a, b));

    }

    public static int gcd(int a, int b) {
        int gcd = 0;
        int max = Math.max(a, b);
        for (int i = 1; i < max; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
