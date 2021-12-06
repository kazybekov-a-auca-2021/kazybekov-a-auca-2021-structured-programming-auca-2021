import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a number: ");
        long number = scan.nextLong();

        System.out.printf("The sum of digits of the number is %d\n", sumOfDigits(number));
    }

    public static long sumOfDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
