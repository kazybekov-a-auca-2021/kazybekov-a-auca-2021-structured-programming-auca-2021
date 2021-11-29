import java.util.Scanner;

public class URI1080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int maxNumber = n, index = 1;

        for (int i = 2; i <= 100; i++) {
            n = scan.nextInt();
            if (maxNumber <= n) {
                maxNumber = n;
                index = i;
            }
        }

        System.out.println(maxNumber + "\n" + index);
    }
}
