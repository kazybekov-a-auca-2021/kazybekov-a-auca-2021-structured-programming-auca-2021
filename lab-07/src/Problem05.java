import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scan.nextInt();

        int[] scores = new int[n];

        System.out.printf("Enter %d scores: ", n);

        scores[0] = scan.nextInt();
        int max = scores[0];

        for (int i = 1; i < n; i++) {
            scores[i] = scan.nextInt();
            if (max < scores[i]) {
                max = scores[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d score is %d and grade is %c\n", i, scores[i], grade(max, scores[i]));
        }

    }

    public static char grade(int max, int num) {
        if (num >= max - 10) return 'A';
        if (num >= max - 20) return 'B';
        if (num >= max - 30) return 'C';
        if (num >= max - 40) return 'D';
        return 'F';
    }
}
