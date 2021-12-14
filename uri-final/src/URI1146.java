import java.util.Scanner;

public class URI1146 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;

        do {
            n = scan.nextInt();
            if (n != 0) {
                for (int i = 1; i < n; i++) {
                    System.out.print(i + " ");
                }
                System.out.print(n);
                System.out.println();
            }
        } while (n != 0);
    }
}
