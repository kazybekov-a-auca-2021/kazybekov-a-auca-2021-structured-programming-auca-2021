import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1st number? ");
        int a = scan.nextInt();
        System.out.print("2nd number? ");
        int b = scan.nextInt();
        System.out.print("3rd number? ");
        int c = scan.nextInt();

        int maxOfAB = (a+b+Math.abs(a-b))/2;
        int maxOfAll = (c+maxOfAB+Math.abs(c-maxOfAB))/2;

        System.out.printf("The value %d is the greatest one.",maxOfAll);
    }
}
