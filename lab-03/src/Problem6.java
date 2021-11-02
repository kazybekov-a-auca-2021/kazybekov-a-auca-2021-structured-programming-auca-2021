import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble();
        double dis = (b * b) - (4.0 * a * c);

        if (dis < 0 || a == 0) System.out.println("The equation has no real roots");
        else if (dis > 0) {
            dis = Math.sqrt(dis);
            double r1 = (-b + dis) / (2.0 * a);
            double r2 = (-b - dis) / (2.0 * a);
            System.out.printf("The equation has two roots %.6f and %.6f%n", r1, r2);
        } else {
            double r1 = (-b + dis) / (2.0 * a);
            System.out.println("The equation has one root " + r1);
        }
    }
}
