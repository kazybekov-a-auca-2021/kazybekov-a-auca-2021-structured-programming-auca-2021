import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Integer? ");
        int n = scan.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.printf("The sum of all digits is %d\n", sum);
    }
}
