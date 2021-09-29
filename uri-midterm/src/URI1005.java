import java.util.Scanner;

public class URI1005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a=scan.nextDouble(), b = scan.nextDouble();
        double av = (a*3.5+b*7.5)/11;
        System.out.printf("MEDIA = %.5f\n",av);
    }
}
