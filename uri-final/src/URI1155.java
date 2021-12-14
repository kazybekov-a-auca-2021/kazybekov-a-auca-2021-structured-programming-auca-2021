import java.util.Scanner;

public class URI1155 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] set = new int[10];

        for (int i = 0; i < 10; i++) {
            set[i] = scan.nextInt();
            if (set[i] <= 0) {
                set[i] = 1;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("X[%d] = %d\n", i, set[i]);
        }
    }
}
