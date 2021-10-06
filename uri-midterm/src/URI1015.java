import java.util.Scanner;

public class URI1015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble(), y1 = scan.nextDouble();
        double x2 = scan.nextDouble(), y2 = scan.nextDouble();
        double pow1 = (x2-x1)*(x2-x1);
        double pow2 = (y2-y1)*(y2-y1);
        double distance = Math.sqrt(pow1+pow2);
        System.out.printf("%.4f\n", distance);
    }
}
