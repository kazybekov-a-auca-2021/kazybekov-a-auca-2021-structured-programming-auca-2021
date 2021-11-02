import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of points? ");
        int points = scan.nextInt();

        if (points >= 90 && points <= 100) {
            System.out.println("Grade: A");
        } else if (points >= 80 && points < 90) {
            System.out.println("Grade: B");
        } else if (points >= 70 && points < 80) {
            System.out.println("Grade: C");
        } else if (points >= 60 && points < 70) {
            System.out.println("Grade: D");
        } else if (points >= 0 && points < 60) {
            System.out.println("Grade: F");
        } else {
            System.out.println(points + " is not in the permitted range.");
        }
    }
}
