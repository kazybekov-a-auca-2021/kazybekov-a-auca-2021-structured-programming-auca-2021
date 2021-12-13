import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N: ");
        int numberOfToss = scan.nextInt();

        int[] arr = new int[13];

        for (int i = 0; i < numberOfToss; i++) {
            int a = (int) (Math.random() * 6) + 1;
            int b = (int) (Math.random() * 6) + 1;
            int sum = a + b;
            arr[sum]++;
        }
        for (int i = 2; i < arr.length; i++) {
            System.out.println(i + ": " + arr[i]);
        }
    }
}