import java.util.Scanner;

public class URI1173 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] set = new int[10];

        int n = scan.nextInt();
        for (int i = 0; i < set.length; i++) {
            set[i] = n;
            n*=2;
            System.out.printf("N[%d] = %d\n",i,set[i]);
        }
    }
}
