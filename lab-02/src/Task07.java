import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double pi = Math.PI;
        System.out.print("Enter the radius and length of a cylinder: ");
        double r = scan.nextDouble();
        double l = scan.nextDouble();
        double area = (r*r)*pi;
        double volume = area*l;
        System.out.printf("The area is %.4f\nThe volume is %.1f\n",area,volume);
    }
}
