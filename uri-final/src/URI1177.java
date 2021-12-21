import java.util.Scanner;

public class URI1177 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] set = new int[1000];
        int n = scan.nextInt();
        int j = 0;
        for (int i = 0; i < set.length; i++) {
            set[i] = j;
            j++;
            System.out.printf("N[%d] = %d\n", i, set[i]);
            if (j == n) {
                j = 0;
            }
        }
    }
}