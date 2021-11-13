import java.util.Random;
import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int lottery = rand.nextInt(900) + 101;

        System.out.print("Input your three-digit number: ");
        int guess = scan.nextInt();

        int firstDigitL = lottery / 100;
        int secondDigitL = lottery % 100 / 10;
        int thirdDigitL = lottery % 10;

        int firstDigitG = guess / 100;
        int secondDigitG = guess % 100 / 10;
        int thirdDigitG = guess % 10;


        if (lottery == guess) {
            System.out.println("You won 10000$");
        } else if ((firstDigitG == firstDigitL) || (firstDigitG == secondDigitL) || (firstDigitG == thirdDigitL)) {
            if ((secondDigitG == firstDigitL) || (secondDigitG == secondDigitL) || (secondDigitG == thirdDigitL)) {
                if ((thirdDigitG == firstDigitL) || (thirdDigitG == secondDigitL) || (thirdDigitG == thirdDigitL)) {
                    System.out.println("You won 3000$");
                }
            } else if ((thirdDigitG != firstDigitL) || (thirdDigitG != secondDigitL) || (thirdDigitG != thirdDigitL)) {
                System.out.println("You won 1000$");
            }
        } else if ((secondDigitG == firstDigitL) || (secondDigitG == secondDigitL) || (secondDigitG == thirdDigitL)) {
            if ((thirdDigitG != firstDigitL) || (thirdDigitG != secondDigitL) || (thirdDigitG != thirdDigitL)) {
                System.out.println("You won 1000$");
            }
        } else if ((thirdDigitG == firstDigitL) || (thirdDigitG == secondDigitL) || (thirdDigitG == thirdDigitL)) {
            System.out.println("You won 1000$");
        } else {
            System.out.println("No matches, you won nothing!");
        }
    }
}
