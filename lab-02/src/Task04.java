import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Length in inches? ");
        double inch = scan.nextDouble();
        double cm = inch * 2.54;
        System.out.printf("%.0f in. = %.2f\n", inch, cm);
    }
}
