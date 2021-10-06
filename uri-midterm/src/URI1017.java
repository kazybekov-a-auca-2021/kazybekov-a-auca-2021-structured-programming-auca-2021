import java.util.Scanner;

public class URI1017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double h = scan.nextDouble(), km = scan.nextDouble();
        double fuel = (h*km)/12;
        System.out.printf("%.3f\n", fuel);
    }
}
