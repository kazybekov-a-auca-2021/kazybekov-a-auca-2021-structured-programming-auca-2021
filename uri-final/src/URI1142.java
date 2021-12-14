import java.util.Scanner;

public class URI1142 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int j = 1;
        for (int i = 0; i < n; i++) {
            int a = j + 1;
            int b = j + 2;
            System.out.println(j + " " + a + " " + b + " PUM");
            j += 4;
        }
    }
}
