import java.util.Scanner;

public class URI1118 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, sum = 0, count = 0;

        do {
            a = scan.nextDouble();
            if (a >= 0 && a <= 10) {
                sum += a;
                count++;
                if (count == 2) {
                    System.out.printf("media = %.2f\n", sum / count);
                    sum = 0;
                } else if (a != 1 && count > 2 && a != 2) {
                    System.out.println("novo calculo (1-sim 2-nao)");
                    sum = 0;
                } else if (a == 1) {
                    System.out.println("novo calculo (1-sim 2-nao)");
                    sum = 0;
                    count = 0;
                }
            } else {
                System.out.println("nota invalida");
            }
        } while (a != 2);

        System.out.println("novo calculo (1-sim 2-nao)");
    }
}
