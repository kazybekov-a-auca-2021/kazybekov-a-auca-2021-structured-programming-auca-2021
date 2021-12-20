import java.util.Scanner;

public class URI1183 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = 12;
        char ch = scan.next().charAt(0);

        double[][] set = new double[size][size];
        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                set[i][j] = scan.nextDouble();
                if (j > i) {
                    sum += set[i][j];
                }
            }
        }

        if (ch == 'S') {
            System.out.printf("%.1f\n", sum);
        } else {
            System.out.printf("%.1f\n", (sum / 66.0));
        }
    }
}
