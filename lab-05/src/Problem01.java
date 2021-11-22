import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double sum = n, amount = 1;
        while (n != 0) {
            n = scan.nextDouble();
            if (n > 0 && n <= 5) {
                sum += n;
                amount++;
            } else {
                continue;
            }
        }

        if (sum != 0) {
            double average = sum / amount;
            System.out.printf("The arithmetic mean is %.1f\n", average);
        } else {
            System.out.println("Nothing to calculate");
        }
    }
}
