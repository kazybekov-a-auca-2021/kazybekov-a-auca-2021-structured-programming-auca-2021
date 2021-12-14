import java.util.Scanner;

public class URI1176 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int position = scan.nextInt();
            System.out.printf("Fib(%d) = %d\n", position, getNumber(position));
        }
    }

    public static long getNumber(int position) {
        if (position == 0 || position == 1) {
            return position;
        }
        long[] fib = new long[position + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < position + 1; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[position];
    }
}
