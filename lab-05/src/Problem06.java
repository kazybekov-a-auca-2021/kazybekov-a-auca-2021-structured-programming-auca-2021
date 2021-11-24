import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 0, sum = n;
        do {
            System.out.print("Eneter an integer (the input ends if it is 0): ");
            n = scan.nextInt();
            sum += n;
        } while (n != 0);
        System.out.printf("The sum is %d", sum);
    }
}
