import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = scan.nextDouble();
        double kilo = pounds * 0.454;
        System.out.printf("%.1f pounds is %.3f kilograms%n", pounds, kilo);

    }
}
