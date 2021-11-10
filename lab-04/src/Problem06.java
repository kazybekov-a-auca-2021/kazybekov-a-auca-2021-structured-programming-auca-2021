import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = scan.nextDouble(), y = scan.nextDouble();
        if (x <= 5 && x >= -5 && y >= -2.5 && y <= 2.5) {
            System.out.printf("Point (%.1f, %.1f) is in the rectangle", x, y);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the rectangle", x, y);
        }
    }
}
