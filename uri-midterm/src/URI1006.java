import java.util.Scanner;

public class URI1006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a=scan.nextDouble(), b = scan.nextDouble(), c= scan.nextDouble();
        double av = (a*2.0+b*3.0+c*5.0)/10.0;
        System.out.printf("MEDIA = %.1f\n", av);
    }
}
