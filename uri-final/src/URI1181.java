import java.util.Scanner;

public class URI1181 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int l = scan.nextInt();
        char ch = scan.next().charAt(0);

        double[][] set = new double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                set[i][j] = scan.nextDouble();
            }
        }
        double sum = 0.0;

        for (int i = 0; i < 12; i++) {
            sum += set[l][i];
        }

        if (ch == 'S') {
            System.out.printf("%.1f\n", sum);
        } else {
            System.out.printf("%.1f\n", (sum / 12.0));
        }
    }
}
