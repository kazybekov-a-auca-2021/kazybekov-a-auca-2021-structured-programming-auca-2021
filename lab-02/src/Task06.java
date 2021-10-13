import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double celsius = scan.nextDouble();
        double fah = (9.0/5.0)*celsius+32;
        System.out.printf("%.0f Celsius is %.1f Fahrenheit",celsius,fah);
    }
}
