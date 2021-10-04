import java.util.Scanner;

public class URI1012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble();
        double triangle = (1/2.0)*a*c;
        double circle = 3.14159*(c*c);
        double trapezium = ((a+b)/2)*c;
        double square = b*b;
        double rectangle = a*b;
        System.out.printf("TRIANGULO: %.3f\n", triangle);
        System.out.printf("CIRCULO: %.3f\n", circle);
        System.out.printf("TRAPEZIO: %.3f\n", trapezium);
        System.out.printf("QUADRADO: %.3f\n", square);
        System.out.printf("RETANGULO: %.3f\n", rectangle);

    }
}
