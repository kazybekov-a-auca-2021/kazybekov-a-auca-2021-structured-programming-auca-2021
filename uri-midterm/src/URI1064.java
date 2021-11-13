import java.util.Scanner;

public class URI1064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        for (int i = 0; i < 6; i++) {
            double num = scan.nextDouble();
            if (num > 0) {
                count++;
                sum += num;
            }
        }
        sum /= count;
        System.out.printf("%d valores positivos\n%.1f\n", count, sum);
    }
}
