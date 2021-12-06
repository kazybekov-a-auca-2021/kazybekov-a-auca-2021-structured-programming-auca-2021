import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        displayPattern(n);
    }

    public static void displayPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if(j>i){
                    System.out.print("  ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
