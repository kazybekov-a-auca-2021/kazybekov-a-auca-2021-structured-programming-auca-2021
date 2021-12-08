import java.util.Scanner;

public class URI1117 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, sum = 0, count = 0;

        do {
            a = scan.nextDouble();
            if (a >= 0 && a <= 10) {
                sum += a;
                count++;
            } else {
                System.out.println("nota invalida");
            }
        } while (count < 2);

        System.out.printf("media = %.2f\n", sum / 2);
    }
}
