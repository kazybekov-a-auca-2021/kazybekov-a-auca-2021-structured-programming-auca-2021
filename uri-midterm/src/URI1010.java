import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble(), prod = scan.nextDouble();
        int a1 = scan.nextInt();
        double b1 = scan.nextDouble(), prod1 = scan.nextDouble();
        prod = b*prod;
        prod1 = b1*prod1;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", (prod+prod1));
    }
}
