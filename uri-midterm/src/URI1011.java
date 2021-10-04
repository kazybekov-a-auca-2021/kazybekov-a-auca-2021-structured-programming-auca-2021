import java.util.Scanner;

public class URI1011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble(), pi = 3.14159;
        double volume = (4/3.0)*pi*(radius*radius*radius);
        System.out.printf("VOLUME = %.3f\n",volume);
    }
}
