import java.util.Scanner;

public class URI1014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kilo = scan.nextDouble(), fuel = scan.nextDouble();
        double totalConsumption = kilo/fuel;
        System.out.printf("%.3f km/l\n", totalConsumption);
    }
}
