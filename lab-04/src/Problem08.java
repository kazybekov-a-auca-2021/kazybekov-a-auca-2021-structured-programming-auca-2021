import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double weight = scan.nextInt();

        if (weight > 0 && weight <= 2) {
            System.out.printf("Cost of shipping is %.2f", weight * 2.5);
        } else if (weight > 2 && weight <= 4) {
            System.out.printf("Cost of shipping is %.2f", weight * 4.5);
        } else if (weight > 4 && weight <= 10) {
            System.out.printf("Cost of shipping is %.2f", weight * 7.5);
        } else if (weight > 10 && weight <= 20) {
            System.out.printf("Cost of shipping is %.2f", weight * 10.5);
        } else {
            System.out.println("the package can not be shipped");
        }
    }
}
