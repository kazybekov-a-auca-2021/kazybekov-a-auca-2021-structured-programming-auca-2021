import java.util.Scanner;

public class URI1043 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble(), b = scan.nextDouble() , c = scan.nextDouble();
        double perimeter = a+b+c;
        double area = ((a+b)*c)/2;
        if(a+b>c && a+c>b && b+c>a) System.out.printf("Perimetro = %.1f\n",perimeter);
        else System.out.printf("Area = %.1f\n", area);
    }
}
