import java.util.Scanner;

public class URI1165 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            System.out.print(number);
            if (isPrime(number)) {
                System.out.println(" eh primo");
            } else {
                System.out.println(" nao eh primo");
            }
        }
    }

    public static boolean isPrime(int n) {
        int count = 0;
        boolean prime = false;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            prime = true;
        }
        return prime;
    }
}
