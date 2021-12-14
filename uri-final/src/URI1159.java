import java.util.Scanner;

public class URI1159 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        while ((num = scan.nextInt()) != 0) {
            if (num % 2 != 0) {
                num += 1;
            }
            int sum = num * 5 + 20;
            System.out.println(sum);
        }
    }
}
