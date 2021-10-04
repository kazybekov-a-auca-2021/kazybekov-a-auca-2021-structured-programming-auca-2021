import java.util.Scanner;

public class URI1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double pi = 3.14159;
        double areaOfCircle = (r*r)*pi;
        double rounding = Math.round(areaOfCircle * 10000.0)/10000.0;
        System.out.println("A="+rounding);
    }
}
