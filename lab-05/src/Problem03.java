import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of tests? ");
        int n = scan.nextInt();
        int correct = 0, incorrect = 0;

        for (int i = 1; i <= n; i++) {
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);
            int c = (int) (Math.random() * 100);
            System.out.println(a + " + " + b + " = " + c);
            if (a + b == c) {
                correct++;
            } else {
                incorrect++;
            }
        }
        System.out.printf("Number of correct answers: %d\n", correct);
        System.out.printf("Number of incorrect answers: %d\n", incorrect);
    }
}
