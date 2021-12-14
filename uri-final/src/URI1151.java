import java.util.Scanner;

public class URI1151 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < n - 1; i++) {
            System.out.print(first + second + " ");
            int temp = first;
            first = second;
            second = temp + second;
        }
        System.out.println(first + second);
    }
}
