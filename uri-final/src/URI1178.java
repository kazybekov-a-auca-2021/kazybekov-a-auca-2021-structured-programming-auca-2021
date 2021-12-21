import java.util.Scanner;

public class URI1178 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = scan.nextDouble();
        double[] set = new double[100];

        for (int i = 0; i < 100; i++) {
            set[i] = number;
            number/=2.0;
        }

        for (int i = 0; i < 100; i++) {
            System.out.printf("N[%d] = %.4f\n",i,set[i]);
        }
    }
}
