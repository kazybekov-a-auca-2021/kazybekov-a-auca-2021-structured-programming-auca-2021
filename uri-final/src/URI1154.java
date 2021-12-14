import java.util.Scanner;

public class URI1154 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double age, sum = 0, amount = 0;

        while ((age = scan.nextDouble()) >= 0) {
            sum += age;
            amount++;
        }
        System.out.printf("%.2f\n", sum / amount);
    }
}
