import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count = 0;
        while (count != 6) {
            if (n % 2 != 0) {
                System.out.println(n);
                count++;
            }
            n++;
        }
    }
}
