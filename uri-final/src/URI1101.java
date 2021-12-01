import java.util.Scanner;

public class URI1101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(), b = scan.nextInt();
        while (a > 0 && b > 0) {
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            int sum = 0;
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println("Sum=" + sum);
            a = scan.nextInt();
            b = scan.nextInt();
        }
    }
}
