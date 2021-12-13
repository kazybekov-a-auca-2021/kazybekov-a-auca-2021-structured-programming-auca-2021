import javax.naming.PartialResultException;
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] set = new int[101];

        System.out.print("Enter the integers between 1 and 100: ");
        int n = scan.nextInt();
        set[n]++;
        while (n != 0) {
            n = scan.nextInt();
            if (n != 0) {
                set[n]++;
            }
        }

        for (int i = 0; i < set.length; i++) {
            if (set[i] != 0) {
                System.out.printf("%d occurs %d times\n", i, set[i]);
            }
        }
    }
}
