import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A = ");
        int a = scan.nextInt();

        System.out.print("B = ");
        int b = scan.nextInt();

        System.out.printf("GCD(%d, %d) = %d", a, b, gcd(a, b));
    }

    public static int gcd(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if (max == 0) return max;

        if (max % min == 0) {
            return min;
        } else {
            int rem = max % min;
            return gcd(min, rem);
        }
    }
}
