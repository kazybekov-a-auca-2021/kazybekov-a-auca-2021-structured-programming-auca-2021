import java.util.Scanner;

public class URI1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double pi = 3.14159;
        double areaOfCircle = (r*r)*pi;
        System.out.printf("A=%.4f%n",areaOfCircle);
    }
}
