import java.util.Random;
import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int lottery = rand.nextInt(900) + 101;

        int guess = scan.nextInt();

        int firstDigitL = lottery / 100;
        int secondDigitL = lottery % 100 / 10;
        int thirdDigitL = lottery % 10;

        int firstDigitG = guess / 100;
        int secondDigitG = guess % 100 / 10;
        int thirdDigitG = guess % 10;
//
//        if (lottery==guess)
    }
}
