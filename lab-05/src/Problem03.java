import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of tests? ");
        int n = scan.nextInt();
        int correct = 0;

        for (int i = 1; i <= n; i++) {
            int a = (int) (Math.random() * 100) - 50;
            int b = (int) (Math.random() * 100) - 50;
            System.out.print(a + " + " + b + " = ");
            int answer = scan.nextInt();
            if (a + b == answer) {
                correct++;
            }
        }
        System.out.printf("Number of correct answers: %d\n", correct);
        System.out.printf("Number of incorrect answers: %d\n", (n - correct));
    }
}
