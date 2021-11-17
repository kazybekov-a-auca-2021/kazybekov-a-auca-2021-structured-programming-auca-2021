import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();

        double distance = Math.sqrt(x * x + y * y);
        //excellent
        if (distance <= 10) {
            System.out.printf("Point (%.1f, %.1f) is in the circle", x, y);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the circle", x, y);
        }
    }
}
