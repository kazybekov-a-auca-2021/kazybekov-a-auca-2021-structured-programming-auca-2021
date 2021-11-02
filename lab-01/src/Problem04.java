import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        //code
        Scanner scan = new Scanner(System.in);
        System.out.print("First int: ");
        int a = scan.nextInt();
        System.out.print("Second int: ");
        int b = scan.nextInt();

        int sum = a + b;
        int sub = a - b;
        int prod = a * b;
        int div = a / b;
        int mod = a % b;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + mod);

    }
}
