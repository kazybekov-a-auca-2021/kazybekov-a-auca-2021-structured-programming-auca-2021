import java.util.Scanner;

public class URI1071 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt();
        int sum = 0;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a == b) {
            System.out.println(0);
        } else {
            for (int i = a + 1; i < b; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}
