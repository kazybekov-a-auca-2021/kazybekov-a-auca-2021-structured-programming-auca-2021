import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("some real number? ");
        double realNumber = scan.nextDouble();
        double r = realNumber;
        if (realNumber < 0) {
            realNumber = -realNumber;
        }
        System.out.printf("|%.4f| = %.4f", r, realNumber);
    }
}
