import java.util.Scanner;

public class URI1175 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] set = new int[20];

        for (int i = 0; i < set.length; i++) {
            set[i] = scan.nextInt();
        }

        reverse(set);
    }
    public static void reverse(int[] set) {
        int j = 0;
        for (int i = set.length - 1; i >= 0; i--) {
            System.out.printf("N[%d] = %d\n", j, set[i]);
            j++;
        }
    }
}