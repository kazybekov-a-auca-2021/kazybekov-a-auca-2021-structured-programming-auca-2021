import java.util.Scanner;

public class URI1134 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int alcohol = 0, gas = 0, diesel = 0, n;

        do {
            n = scan.nextInt();
            switch (n) {
                case 1 -> alcohol++;
                case 2 -> gas++;
                case 3 -> diesel++;
            }
        } while (n != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + diesel);
    }
}
