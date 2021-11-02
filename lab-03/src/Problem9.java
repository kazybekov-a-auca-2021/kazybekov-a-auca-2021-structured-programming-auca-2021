import java.util.Random;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int bot = rand.nextInt(3);
        System.out.print("scissors (0), rock (1), paper (2): ");
        int player = scan.nextInt();

        if (player < 0 || player > 2) {
            System.out.println("This number is no applicable, try one more time");
        } else if (bot == 0) {
            if (player == 1) {
                System.out.println("The computer is scissors. You are rock. You won.");
            } else if (player == 2) {
                System.out.println("The computer is scissors. You are paper. You lost.");
            } else {
                System.out.println("The computer is scissors. You are scissors too. It is draw.");
            }
        } else if (bot == 1) {
            if (player == 0) {
                System.out.println("The computer is rock. You are scissors. You lost.");
            } else if (player == 2) {
                System.out.println("The computer is rock. You are paper. You won.");
            } else {
                System.out.println("The computer is rock. You are rock too. It is draw.");
            }
        } else {
            if (player == 0) {
                System.out.println("The computer is paper. You are scissors. You won.");
            } else if (player == 1) {
                System.out.println("The computer is paper. You are rock. You lost.");
            } else {
                System.out.println("The computer is paper. You are paper too. It is draw.");
            }
        }
    }
}