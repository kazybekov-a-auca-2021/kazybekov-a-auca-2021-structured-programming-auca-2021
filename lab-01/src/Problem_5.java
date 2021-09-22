import java.util.Scanner;

public class Problem_5 {
    public static void main (String[] args) {
        //code
        Scanner scan = new Scanner(System.in);
        System.out.print("First double: ");
        double a = scan.nextDouble();
        System.out.print("Second double: ");
        double b = scan.nextDouble();

        double sum = a+b;
        double sub = a-b;
        double prod = a*b;
        double div = a/b;
        double mod = a%b;
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + mod);
    }
}
