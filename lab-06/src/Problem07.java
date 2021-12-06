import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = scan.nextInt();

        System.out.println(isPalindrome(number));
    }

    public static String isPalindrome(int number) {
        boolean palindrome = reverse(number) == number;

        if (palindrome) {
            return "YES, the number is a palindrome";
        }
        return "NO, the number is not a palindrome";
    }

    public static int reverse(int n) {
        int amount = -1;
        int checkN = n;
        while (checkN > 0) {
            checkN /= 10;
            amount++;
        }

        int newOne = n % 10 * (pow(10, amount));
        n /= 10;
        amount--;
        while (n > 0) {
            newOne += n % 10 * (pow(10, amount));
            n /= 10;
            amount--;
        }
        return newOne;
    }

    public static int pow(int n, int range) {
        int p = 1;
        for (int i = 1; i <= range; i++) {
            p *= n;
        }
        return p;
    }
}
