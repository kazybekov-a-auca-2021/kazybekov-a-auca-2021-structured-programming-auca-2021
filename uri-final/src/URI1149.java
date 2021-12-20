import java.util.Scanner;

public class URI1149 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(), n;

        do {
            n = scan.nextInt();
        } while (n <= 0);

        int num = a;
        n--;
        while (n > 0) {
            a++;
            num += a;
            n--;
        }

        System.out.println(num);
    }
}
