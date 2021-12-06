import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n = 901;
        estimatedPI(n);
    }

    public static void estimatedPI(double n) {
        System.out.println("i            m(i)");
        System.out.println("___________________");
        System.out.printf("%.0f            %.4f\n", 1.0, 4.0);
        for (double i = 101; i <= n; i += 100) {
            double mI = 4;
            double sum = 0.0;
            for (double j = 1; j <= i; j++) {
                sum += (Math.pow(-1, j + 1)) / (2 * j - 1);
            }
            System.out.printf("%.0f          %.4f\n", i, mI * sum);
        }
    }
}
