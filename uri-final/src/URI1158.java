import java.util.Scanner;

public class URI1158 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int sequence = 0;
            if (x % 2 == 0) {
                x += 1;
            }
            while (y > 0) {
                sequence += x;
                x += 2;
                y--;
            }
            System.out.println(sequence);
        }
    }
}
