import java.util.Scanner;

public class URI1178 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = scan.nextDouble();

        int length = 0;
        double[] arr = new double[100];

        while (length < 100) {
            arr[length] = number;
            number /= 2;
            length++;
        }

        for (int i = 0; i < length; i++) {
            System.out.printf("N[%d] = %.4f\n", i, arr[i]);
        }
    }
}
