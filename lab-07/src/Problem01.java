import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N: ");
        int numberOfToss = scan.nextInt();

        int[] arr = new int[11];

        for (int i = 0; i < numberOfToss; i++) {
            int a = (int) (Math.random() * 6) + 1;
            int b = (int) (Math.random() * 6) + 1;
            int sum = a + b;
            checkForNumber(sum, arr);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 2 + ": " + arr[i]);
        }
    }

    public static void checkForNumber(int sum, int[] set) {
        switch (sum) {
            case 2 -> set[0]++;
            case 3 -> set[1]++;
            case 4 -> set[2]++;
            case 5 -> set[3]++;
            case 6 -> set[4]++;
            case 7 -> set[5]++;
            case 8 -> set[6]++;
            case 9 -> set[7]++;
            case 10 -> set[8]++;
            case 11 -> set[9]++;
            case 12 -> set[10]++;
        }
    }
}