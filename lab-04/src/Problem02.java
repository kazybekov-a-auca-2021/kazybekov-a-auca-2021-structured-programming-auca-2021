import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("month? ");
        int number = scan.nextInt();

        if (number == 1) {
            System.out.println("january");
        } else if (number == 2) {
            System.out.println("february");
        } else if (number == 3) {
            System.out.println("march");
        } else if (number == 4) {
            System.out.println("april");
        } else if (number == 5) {
            System.out.println("may");
        } else if (number == 6) {
            System.out.println("june");
        } else if (number == 7) {
            System.out.println("july");
        } else if (number == 8) {
            System.out.println("august");
        } else if (number == 9) {
            System.out.println("september");
        } else if (number == 10) {
            System.out.println("october");
        } else if (number == 11) {
            System.out.println("november");
        } else {
            System.out.println("december");
        }
    }
}
