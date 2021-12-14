import java.util.Scanner;

public class URI1164 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            System.out.print(num);
            if (isPerfect(num)) {
                System.out.println(" eh perfeito");
            } else {
                System.out.println(" nao eh perfeito");
            }
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        boolean perfect = false;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            perfect = true;
        }
        return perfect;
    }
}
