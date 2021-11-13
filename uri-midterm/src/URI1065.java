import java.util.Scanner;

public class URI1065 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            if (num % 2 == 0) {
                count++;
            }
        }
        System.out.printf("%d valores pares\n", count);
    }
}
