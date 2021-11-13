import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input coordinates of point A: ");
        double ax = scan.nextDouble(), ay = scan.nextDouble();
        System.out.println();
        System.out.print("Input coordinates of point B: ");
        double bx = scan.nextDouble(), by = scan.nextDouble();
        System.out.println();
        System.out.print("Input coordinates of point C: ");
        double cx = scan.nextDouble(), cy = scan.nextDouble();
        System.out.println();

        double A = Math.sqrt((ax - bx) * (ax - bx) + (ay - by) * (ay - by));
        double B = Math.sqrt((cx - bx) * (cx - bx) + (cy - by) * (cy - by));
        double C = Math.sqrt((cx - ax) * (cx - ax) + (cy - ay) * (cy - ay));

        boolean isTriangle = A + B > C || A + C > B || B + C > A;

        if (isTriangle) {
            double perimeterOfTriangleABC = A + B + C;
            System.out.println("The perimeter of a triangle ABC is " + perimeterOfTriangleABC);
        } else {
            System.out.println("It cannot be a triangle");
        }
    }
}
